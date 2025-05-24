package com.onepieceofjava.Daneris_Springboot.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/daneris")
public class Message {

    @GetMapping("/hello")
    public String message(){
        return "hello daneris";
    }
}
