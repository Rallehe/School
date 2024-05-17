package se.yrgo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class StartPageController {
    @GetMapping(value="/")
    public String index() {
        return "index";
    }


}
