package pl.sda.mobilnypasazeradmin.Elevators;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ElevatorController {

    private final ElevatorService elevatorService;

    @Autowired
    public ElevatorController(ElevatorService elevatorService) {
        this.elevatorService = elevatorService;
    }

    @GetMapping("/new-elevator-form")
    String registerTicket (Model model) {
        model.addAttribute( "ticket", new ElevatorTicket() );
        return "awariawindy";
    }

    @PostMapping(value="/new-elevator-malfunction")
    public String saveTicket(@ModelAttribute(name = "ticket") ElevatorTicketDTO ticket, Model model){

        elevatorService.registerTicket(ticket);
        model.addAttribute( "ticketList", elevatorService.getTicketList());
        return "ticketList";
    }


}


