package com.Hique2605.spring_boot_aula.model;

import jakarta.persistence.*;

@Entity
@Table(name ="usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(unique = true, nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    public Usuario(){

    }

    public Usuario(String username, String password) {
        this.username = username;
        this.password = password;
    }


    public Long getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }



}
