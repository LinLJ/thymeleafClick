package com.pure.demo.api;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ThyController {

    @RequestMapping(value = "show", method = RequestMethod.GET)
    public String show(Model model){
        model.addAttribute("uid","123456789");
        model.addAttribute("name","show");
        return "show";
    }

    @RequestMapping(value = "index", method = RequestMethod.GET)
    public String index(Model model){
        model.addAttribute("uid","9876543121");
        model.addAttribute("name","index");
        return "index";
    }
}

