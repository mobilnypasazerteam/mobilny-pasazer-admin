package pl.sda.mobilnypasazeradmin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
class HomeController {

    @GetMapping("/")
    String index(Model model) {
        return "homepage";
    }


}