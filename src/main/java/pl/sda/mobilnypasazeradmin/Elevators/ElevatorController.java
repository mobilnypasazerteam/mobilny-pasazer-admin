package pl.sda.mobilnypasazeradmin.Elevators;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class ElevatorController {

    private final ElevatorService elevatorService;

    @Autowired
    public ElevatorController(ElevatorService elevatorService) {
        this.elevatorService = elevatorService;
    }

    @GetMapping("/new-elevator-form")
    String registerTicketElevator (Model model) {
        ElevatorTicketDTO elevatorTicketDTO = new ElevatorTicketDTO();
        model.addAttribute( "elevatorTicketDTO", elevatorTicketDTO);
        return "awariawindy";
    }

    @PostMapping(value="/new-elevator-malfunction")
    public String saveTicket(@ModelAttribute(name = "elevatorTicketDTO") @Valid ElevatorTicketDTO elevatorTicketDTO,
                             BindingResult result, Model model){
        if(result.hasErrors()){
            model.addAttribute("elevatorTicketDTO", elevatorTicketDTO);
            return "awariawindy";
        }
        elevatorService.registerTicket(elevatorTicketDTO);
        return "ticketList";

    }

    @GetMapping("/elevators-malfunction-list")
    public String lista (Model model) {
        model.addAttribute( "ticketList", elevatorService.getTicketList() );
        return "ticketList";
    }


}


