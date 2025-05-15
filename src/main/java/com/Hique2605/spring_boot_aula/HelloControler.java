package com.Hique2605.spring_boot_aula;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class HelloControler {

    @GetMapping("/hello")
    public String hello(){
        return "Olá, Mundo!! Bem-vindo ao Spring Boot";
    }


}
