package com.example.SprintSecurityAuth2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {
    
    @RequestMapping("/")
    public String gretting(){
        return "Hello World";
    }

}
