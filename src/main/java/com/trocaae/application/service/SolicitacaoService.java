package com.trocaae.application.service;

import com.trocaae.application.model.sql.Solicitacao;
import com.trocaae.application.model.util.Status;
import com.trocaae.application.repository.SolicitacaoRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SolicitacaoService {

    private SolicitacaoRepository repository;

    public SolicitacaoService(SolicitacaoRepository repository) {
        this.repository = repository;
    }

    public void aceitarSolicitacao(Long solicatacaoId) {
        Optional<Solicitacao> solicitacao = this.repository.findById(solicatacaoId);
        solicitacao.ifPresent(value -> {
            value.setStatus(Status.APROVADO);
            this.repository.save(value);
        });
    }
}




