package com.Hique2605.spring_boot_aula.model;

import jakarta.persistence.*;

@Entity  //anotacao jpa entidade jpa
@Table(name = "produto")  //defini o nome da tabela
public class Produto {

        @Id         //indica que é um id
        @GeneratedValue(strategy = GenerationType.IDENTITY)  // indica que é chave 1 e gera id automatico
        private Long id;

        private String nome;
        private Double preco;

        public Produto(){

        }

    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

}

