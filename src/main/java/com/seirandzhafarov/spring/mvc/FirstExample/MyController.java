package com.seirandzhafarov.spring.mvc.FirstExample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    @RequestMapping("/")
    public String showFirstView(){
        return "FirstExample/FirstView";
    }

    @RequestMapping("/askDetails")
    public String askDetails(){
        return "FirstExample/askDetails";
    }

    @RequestMapping("/showDetails")
    public String showDetails(){
        return "FirstExample/showDetails";
    }
}
