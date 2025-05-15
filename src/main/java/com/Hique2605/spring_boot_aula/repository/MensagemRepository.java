package com.Hique2605.spring_boot_aula.repository;

import org.springframework.stereotype.Repository;

@Repository
public class MensagemRepository {

    public String obterMessagem(){
        return "Olá do repositorio";
    }


}

