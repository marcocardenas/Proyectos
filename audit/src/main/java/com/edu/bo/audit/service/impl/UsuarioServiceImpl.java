package com.edu.bo.audit.service.impl;

import com.edu.bo.audit.model.Usuario;
import com.edu.bo.audit.repository.UsuarioRepository;
import com.edu.bo.audit.service.UsuarioService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioServiceImpl(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public void guardar(Usuario usuarioRequest) {

        Usuario usuario = new Usuario();
        if(usuarioRequest.getId() == null){
        } else {
            usuario = usuarioRepository.getReferenceById(usuarioRequest.getId());
        }
        usuario.setName(usuarioRequest.getName());
        usuarioRepository.save(usuario);
    }

    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }
}
