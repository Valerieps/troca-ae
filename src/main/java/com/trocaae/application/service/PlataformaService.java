package com.trocaae.application.service;

import com.trocaae.application.model.dto.PlataformaDTO;
import com.trocaae.application.model.sql.Plataforma;
import com.trocaae.application.repository.PlatormaRepository;
import javassist.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public Plataforma criarNovaPlataforma(PlataformaDTO plataformaDTO) {
        Plataforma plataforma = new Plataforma();
        plataforma.setName(plataformaDTO.getName());
        plataforma.setFabricante(plataformaDTO.getFabricante());
        plataforma.setRegiao(plataformaDTO.getRegiao());
        return this.repository.save(plataforma);
    }

    public Plataforma atualizarPlataforma(Long plataformaId, PlataformaDTO plataformaDTO) throws NotFoundException {
        Plataforma plataforma = this.repository.findById(plataformaId)
                .orElseThrow(() -> new NotFoundException("Plataforma não encontrado"));
        if (plataformaDTO.getName() != null)
            plataforma.setName(plataformaDTO.getName());
        if (plataformaDTO.getRegiao() != null)
            plataforma.setRegiao(plataformaDTO.getRegiao());
        if (plataformaDTO.getFabricante() != null)
            plataforma.setFabricante(plataformaDTO.getFabricante());
        return this.repository.save(plataforma);
    }

    public Plataforma visualizarPlataforma(Long plataformaId) throws NotFoundException {
        return this.repository.findById(plataformaId)
                .orElseThrow(() -> new NotFoundException("Plataforma não encontrado"));
    }

    public List<Plataforma> visualizarTodasPlataformas() {
        return this.repository.findAll();
    }

    public String deletarPlataforma(Long plataformaId) {
        this.repository.deleteById(plataformaId);
        return "Plataforma com id: " + plataformaId + " deletado com sucesso";
    }

}
