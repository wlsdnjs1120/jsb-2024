package com.example.sbb;

import org.springframework.web.bind.annotation.GetMapping;

public class MainController {
    @GetMapping("/")
    public void home(){
        System.out.println("home");
    }


    @GetMapping("/about")
    public void about(){
        System.out.println("about");
    }

}
