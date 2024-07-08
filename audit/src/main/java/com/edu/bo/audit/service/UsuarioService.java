package com.edu.bo.audit.service;

import com.edu.bo.audit.model.Usuario;

import java.util.List;

public interface UsuarioService {
    void guardar(Usuario usuario);
    List<Usuario> findAll();
}
