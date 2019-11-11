package com.trocaae.application.model.dto;

import com.trocaae.application.model.util.Status;

import java.time.LocalDate;

public class SolicitacaoDTO {

    private Long idJogoInstancia;
    private Long idSolicitante;
    private Status status;
    private LocalDate dataDeDevolucao;

    public Long getIdJogoInstancia() {
        return idJogoInstancia;
    }

    public void setIdJogoInstancia(Long idJogoInstancia) {
        this.idJogoInstancia = idJogoInstancia;
    }

    public Long getIdSolicitante() {
        return idSolicitante;
    }

    public void setIdSolicitante(Long idSolicitante) {
        this.idSolicitante = idSolicitante;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public LocalDate getDataDeDevolucao() {
        return dataDeDevolucao;
    }

    public void setDataDeDevolucao(LocalDate dataDeDevolucao) {
        this.dataDeDevolucao = dataDeDevolucao;
    }
}
