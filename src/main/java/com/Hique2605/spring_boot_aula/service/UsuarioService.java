package com.Hique2605.spring_boot_aula.service;

import com.Hique2605.spring_boot_aula.model.Usuario;
import com.Hique2605.spring_boot_aula.repository.UsuarioRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final PasswordEncoder passwordEncoder;

    public UsuarioService(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
        this.passwordEncoder = new BCryptPasswordEncoder();
    }

    public Usuario registrarUsuario(String username, String password) {
        String senhaCriptografada = passwordEncoder.encode(password);
        Usuario usuario = new Usuario(username, senhaCriptografada);
        return usuarioRepository.save(usuario);
    }

    public Optional<Usuario> buscarPorUsername(String username){
        return usuarioRepository.findByUsername(username);
    }


}
