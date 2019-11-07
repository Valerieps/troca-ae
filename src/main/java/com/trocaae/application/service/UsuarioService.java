package com.trocaae.application.service;

import com.trocaae.application.model.dto.UsuarioDTO;
import com.trocaae.application.model.sql.Usuario;
import com.trocaae.application.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

     private UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    public Usuario create(UsuarioDTO usuarioDTO){
        Usuario usuario = new Usuario();
        usuario.setDataDeNascimento(usuarioDTO.getDataDeNascimento());
        usuario.setEmail(usuarioDTO.getEmail());
        usuario.setEstaBloqueado(usuarioDTO.getEstaBloqueado());
        usuario.setMatricula(usuarioDTO.getMatricula());
        usuario.setName(usuarioDTO.getName());

        return this.repository.save(usuario);
    }
}
