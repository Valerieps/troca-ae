package com.trocaae.application.service;

import com.trocaae.application.model.dto.JogoPerfilDTO;
import com.trocaae.application.model.sql.JogoPerfil;
import com.trocaae.application.model.sql.Plataforma;
import com.trocaae.application.model.sql.Usuario;
import com.trocaae.application.repository.JogoPerfilRepository;
import javassist.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JogoPerfilService {

    private JogoPerfilRepository repository;

    private PlataformaService plataformaService;

    public JogoPerfilService(JogoPerfilRepository repository, PlataformaService plataformaService) {
        this.repository = repository;
        this.plataformaService = plataformaService;
    }

    public JogoPerfil getJogoPerfil(Long perfilId) throws NotFoundException {
        return this.repository.findById(perfilId)
                .orElseThrow(() -> new NotFoundException("Perfil não encontrado"));
    }

    public JogoPerfil criarJogoPerfil(JogoPerfilDTO jogoPerfilDTO) {
        JogoPerfil jogoPerfil = new JogoPerfil();
        jogoPerfil.setClassificacaoIndicativa(jogoPerfilDTO.getClassificacaoIndicativa());
        jogoPerfil.setPublisher(jogoPerfilDTO.getPublisher());
        jogoPerfil.setTitulo(jogoPerfilDTO.getTitulo());
        return this.repository.save(jogoPerfil);
    }

    public JogoPerfil atualizarJogoPerfil(Long jogoPerfilId, JogoPerfilDTO jogoPerfilDTO) throws NotFoundException {
        JogoPerfil jogoPerfil = this.repository.findById(jogoPerfilId)
                .orElseThrow(() -> new NotFoundException("Perfil de jogo não encontrado"));
        if (jogoPerfilDTO.getClassificacaoIndicativa() != null)
            jogoPerfil.setClassificacaoIndicativa(jogoPerfilDTO.getClassificacaoIndicativa());
        if (jogoPerfilDTO.getPublisher() != null)
            jogoPerfil.setPublisher(jogoPerfilDTO.getPublisher());
        if (jogoPerfilDTO.getTitulo() != null)
            jogoPerfil.setTitulo(jogoPerfilDTO.getTitulo());
        return this.repository.save(jogoPerfil);
    }

    public JogoPerfil visualizarJogoPerfil(Long jogoPerfilId) throws NotFoundException {
        return this.repository.findById(jogoPerfilId)
                .orElseThrow(() -> new NotFoundException("Jogo Perfil não encontrado"));
    }

    public List<JogoPerfil> viewList() {
        return this.repository.findAll();
    }

    public String delete(Long jogoPerfilId) {
        this.repository.deleteById(jogoPerfilId);
        return "Jogo Perfil " + jogoPerfilId + " deletado com sucesso";
    }

    public JogoPerfil addPlataforma(Long jogoPerfilId, Long plataformaId) throws NotFoundException {
        JogoPerfil jogoPerfil = this.repository.findById(jogoPerfilId)
                .orElseThrow(() -> new NotFoundException("Perfil de jogo não encontrado"));
        Plataforma plataforma = plataformaService.getPlataforma(plataformaId);
        jogoPerfil.adicionaPlataforma(plataforma);
        return this.repository.save(jogoPerfil);
    }

}
