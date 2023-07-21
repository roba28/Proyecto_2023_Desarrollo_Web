
package com.Proyecto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/index")
public class IndexController {
    
    @RequestMapping("/")
    public String page(Model model) {
       // model.addAttribute("attribute", "value");
        return "index";
    }
}