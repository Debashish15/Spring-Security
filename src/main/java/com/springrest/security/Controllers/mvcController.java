package com.springrest.security.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class mvcController {

    @GetMapping("/hello")
    public  String web(){
        return "index";
    }
}
