package com.Hique2605.spring_boot_aula.controller;

import com.Hique2605.spring_boot_aula.service.MensagemService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MensagemController {

    private final MensagemService mensagemService;

    public MensagemController( MensagemService mensagemService){
        this.mensagemService = mensagemService;
    }

    @GetMapping("/mensagem")
    public String mensagem(){
        return mensagemService.obterMensagem();
    }


}
