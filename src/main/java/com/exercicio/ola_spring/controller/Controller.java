package com.exercicio.ola_spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {
    @GetMapping("/get")
    public String olaSpring() {
        return "Olá Spring";
    }
}
