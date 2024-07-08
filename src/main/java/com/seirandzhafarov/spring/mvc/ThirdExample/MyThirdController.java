package com.seirandzhafarov.spring.mvc.ThirdExample;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/third")
public class MyThirdController {

    @RequestMapping("/")
    public String showFirstView(){
        return "3_ThirdView";
    }

    @RequestMapping("/askDetails")
    public String askDetails(Model model){

        model.addAttribute("employee", new Employee());

        return "3_ThirdAskDetails";
    }

    @RequestMapping("/showDetails")
    public String showDetails(@Valid @ModelAttribute("employee") Employee employee,
                              BindingResult result){
        if (result.hasErrors()) {
            return "3_ThirdAskDetails";
        }
        return "3_ThirdShowDetails";
    }
}
