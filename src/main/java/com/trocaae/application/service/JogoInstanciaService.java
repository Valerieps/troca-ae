package com.trocaae.application.service;

import com.trocaae.application.model.dto.JogoInstanciaDTO;
import com.trocaae.application.model.sql.JogoInstancia;
import com.trocaae.application.model.sql.JogoPerfil;
import com.trocaae.application.model.sql.Usuario;
import com.trocaae.application.model.util.Status;
import com.trocaae.application.repository.JogoInstanciaRepository;
import javassist.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JogoInstanciaService {

    private JogoInstanciaRepository repository;

    private UsuarioService usuarioService;
    private JogoPerfilService jogoPerfilService;

    public JogoInstancia getJogoInstancia(Long jogoInstanciaId) throws NotFoundException {
        return this.repository.findById(jogoInstanciaId)
                .orElseThrow(() -> new NotFoundException("Jogo Instancia não encontrado"));
    }

    public void update(Long jogoInstanciaId, Long solicitanteId) throws NotFoundException {
        JogoInstancia jogoInstancia = this.repository.findById(jogoInstanciaId)
                .orElseThrow(() -> new NotFoundException("Jogo Instancia não encontrado"));
        Usuario solicitante = this.usuarioService.getUsuario(solicitanteId);
        jogoInstancia.setLocatario(solicitante);
        this.repository.save(jogoInstancia);
    }

    public JogoInstancia create(JogoInstanciaDTO jogoInstanciaDTO) throws NotFoundException {
        Usuario usuario = this.usuarioService.getUsuario(jogoInstanciaDTO.getIdDonoDoJogo());
        JogoPerfil jogoPerfil = jogoPerfilService.getJogoPerfil(jogoInstanciaDTO.getIdJogoPerfil());
        JogoInstancia jogoInstancia = new JogoInstancia();
        jogoInstancia.setDonoDoJogo(usuario);
        jogoInstancia.setJogoPerfil(jogoPerfil);
        jogoInstancia.setSituacao(Status.DISPONIVEL);
        return this.repository.save(jogoInstancia);
    }

    public JogoInstancia view(Long jogoInstanciaId) throws NotFoundException {
        return this.repository.findById(jogoInstanciaId)
                .orElseThrow(() -> new NotFoundException("Jogo Instancia não encontrado"));
    }

    public List<JogoInstancia> viewList() {
        return this.repository.findAll();
    }

    public String delete(Long jogoPerfilId) {
        this.repository.deleteById(jogoPerfilId);
        return " Jogo Instancia " + jogoPerfilId + " deletado com sucesso";
    }

}
