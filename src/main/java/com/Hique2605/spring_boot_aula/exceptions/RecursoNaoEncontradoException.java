package com.Hique2605.spring_boot_aula.exceptions;

public class RecursoNaoEncontradoException extends RuntimeException{

    public RecursoNaoEncontradoException(String mensagem){
        super(mensagem);
    }

}
