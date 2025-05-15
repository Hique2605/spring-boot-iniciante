package com.Hique2605.spring_boot_aula.service;

import com.Hique2605.spring_boot_aula.repository.MensagemRepository;
import org.springframework.stereotype.Service;

@Service
public class MensagemService {

    private final MensagemRepository mensagemRepository; //final precisa ser instanciada // o spring que faz isso,

    public MensagemService(MensagemRepository mensagemRepository){
        this.mensagemRepository = mensagemRepository;
    }

    public String obterMensagem(){
        return mensagemRepository.obterMessagem();
    }


}
