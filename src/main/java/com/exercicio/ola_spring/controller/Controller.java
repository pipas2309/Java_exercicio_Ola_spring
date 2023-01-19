package com.exercicio.ola_spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {

    @ResponseBody
    @GetMapping("/get")
    public String olaSpring(@RequestParam(required = false) String nome) {
        if(nome == null || nome.equals("")) {
            return "Escreva seu nome no link dessa forma ?nome=SEU_NOME";
        } else {
            return "Cuidado, " + nome + ", agora você está num esquema de pirâmide e precisa bater a meta!";
        }
        
    }
}