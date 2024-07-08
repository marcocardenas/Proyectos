package com.edu.bo.audit.controller;

import com.edu.bo.audit.model.Usuario;
import com.edu.bo.audit.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/usuarios")
@RequiredArgsConstructor
public class UsuarioController {
    private final UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<?> save(@RequestBody Usuario request) {
        usuarioService.guardar(request);
        return ResponseEntity.accepted().build();
    }

    @GetMapping
    public ResponseEntity<List<Usuario>> findAllBooks() {
        return ResponseEntity.ok(usuarioService.findAll());
    }
}
