package pl.sda.mobilnypasazeradmin.Elevators;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class ElevatorApiController {

    private final ElevatorService elevatorService;

    @Autowired
    public ElevatorApiController(ElevatorService elevatorService) {
        this.elevatorService = elevatorService;
    }

    @GetMapping("/api/elevators-malfunction-list")
    public List<ElevatorTicketDTO> lista (Model model) {
        List<ElevatorTicketDTO> ticketList = elevatorService.getTicketList();
        return ticketList;
    }


}


