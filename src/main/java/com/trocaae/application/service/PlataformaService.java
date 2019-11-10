package com.trocaae.application.service;

import com.trocaae.application.model.sql.Plataforma;
import com.trocaae.application.repository.PlatormaRepository;
import javassist.NotFoundException;
import org.springframework.stereotype.Service;

@Service
public class PlataformaService {

    private PlatormaRepository repository;

    public PlataformaService(PlatormaRepository repository) {
        this.repository = repository;
    }

    public Plataforma getPlataforma(Long plataformaId) throws NotFoundException {
        return this.repository.findById(plataformaId)
                .orElseThrow(() -> new NotFoundException("Perfil de jogo não encontrado"));
    }

//    // todo Adicionar um novo perfil
//    public void adicionarNovoPerfil(JogoPerfil jogo){
//
//    }
//
//    // todo Remover um perfil, so possivel se não houver nenhum jogoInstancia cadastrado para aquele perfil
//    public void removerPerfil(JogoPerfil jogo){
//
//    }

    // todo Visualizar uma lista de plataforma (pode ser filtrado por atributos)
    //??

    // todo Atualizar um perfil existente
    // em JogoPerfil Entity tem todos os getters e setters. Precisa disso?

}
