package com.study.iamport.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping
public class HomeController {

    @GetMapping("/home")
    public ModelAndView home() {
        return new ModelAndView("order");
    }


    @GetMapping("/sub")
    public ModelAndView paypal() {
        return new ModelAndView("subscribe");
    }
}
