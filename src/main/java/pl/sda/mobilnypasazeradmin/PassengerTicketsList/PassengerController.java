package pl.sda.mobilnypasazeradmin.PassengerTicketsList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class PassengerController {

    private static final String PASSENGER_DTO = "passengerDto";

    private final PassengerService passengerService;

    @Autowired
    public PassengerController(PassengerService passengerService) {
        this.passengerService = passengerService;
    }

    @GetMapping("/passenger-ticket-list")
    public String lista (Model model) {
        model.addAttribute( "ticketList", passengerService.getTicketList() );
        model.addAttribute("mobilityTypes", ReducedMobilityType.values());
        return "listazgloszen";
    }

}
