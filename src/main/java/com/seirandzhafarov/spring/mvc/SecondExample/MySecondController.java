package com.seirandzhafarov.spring.mvc.SecondExample;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/second")
public class MySecondController {

    @RequestMapping("/")
    public String showFirstView(){
        return "SecondView";
    }

    @RequestMapping("/askDetails")
    public String askDetails(){
        return "SecondAskDetails";
    }

    @RequestMapping("/showDetails")
    public String showDetails(HttpServletRequest request, Model model){

        String name = request.getParameter("employeeName");
        name = "Mr." + name;

        model.addAttribute("name", name);

        return "SecondShowDetails";
    }
}
