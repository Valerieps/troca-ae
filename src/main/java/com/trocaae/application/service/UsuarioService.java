package com.trocaae.application.service;

import com.trocaae.application.model.dto.UsuarioDTO;
import com.trocaae.application.model.sql.Usuario;
import com.trocaae.application.repository.UsuarioRepository;
import javassist.NotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    private UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    public Usuario getUsuario(Long usuarioId) throws NotFoundException {
        return this.repository.findById(usuarioId)
                .orElseThrow(() -> new NotFoundException("Usuario não encontrado"));
    }

    public Usuario create(UsuarioDTO usuarioDTO) {
        Usuario usuario = new Usuario();
        usuario.setDataDeNascimento(usuarioDTO.getDataDeNascimento());
        usuario.setEmail(usuarioDTO.getEmail());
        usuario.setEstaBloqueado(usuarioDTO.getEstaBloqueado());
        usuario.setMatricula(usuarioDTO.getMatricula());
        usuario.setName(usuarioDTO.getName());

        return this.repository.save(usuario);
    }

    public Usuario update(Long usuarioId, UsuarioDTO usuarioDTO) throws NotFoundException {
        Usuario usuario = this.repository.findById(usuarioId).orElseThrow(() -> new NotFoundException("Usuario não encontrado"));
        if (usuarioDTO.getDataDeNascimento() != null) usuario.setDataDeNascimento(usuarioDTO.getDataDeNascimento());
        if (usuarioDTO.getEmail() != null) usuario.setEmail(usuarioDTO.getEmail());
        if (usuarioDTO.getMatricula() != null) usuario.setMatricula(usuarioDTO.getMatricula());
        if (usuarioDTO.getName() != null) usuario.setName(usuarioDTO.getName());
        return this.repository.save(usuario);
    }

    public Usuario view(Long usuarioId) throws NotFoundException {
        return this.repository.findById(usuarioId)
                .orElseThrow(() -> new NotFoundException("Usuario não encontrado"));
    }

    public String delete(Long usuarioId) {
        this.repository.deleteById(usuarioId);
        return "Usuário " + usuarioId + " deletado com sucesso";
    }
}
