package com.Hique2605.spring_boot_aula.controller;

import com.Hique2605.spring_boot_aula.model.Usuario;
import com.Hique2605.spring_boot_aula.security.JwtUtil;
import com.Hique2605.spring_boot_aula.service.UsuarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Optional;


@RestController
@RequestMapping("/auth")
public class AuthController {

    private final UsuarioService usuarioService;

    public AuthController(UsuarioService usuarioService){
        this.usuarioService = usuarioService;
    }

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody Map<String, String> request){
        Usuario usuario = usuarioService.registrarUsuario(request.get("username"),"password");
        return ResponseEntity.ok(usuario);
    }


    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Map<String, String> request){
        Optional<Usuario> usuario = usuarioService.buscarPorUsername(request.get("username"));
        if(usuario.isPresent() && usuario.get().getPassword().equals(request.get("password"))){
            String token = JwtUtil.generateToken(usuario.get().getUsername());
            return ResponseEntity.ok(Map.of("token", token));
        }
        return ResponseEntity.status( 401).body("Credenciais invalidas");
    }


}
