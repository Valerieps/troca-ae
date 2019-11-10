package com.trocaae.application.model.dto;

import java.time.LocalDate;

public class SolicitacaoDTO {

    private Long idJogoInstancia;
    private Long idDonoDoJogo;
    private String status;
    private LocalDate dataDeDevolucao;

    public Long getIdJogoInstancia() {
        return this.idJogoInstancia;
    }

    public void setIdJogoInstancia(Long idJogoInstancia) {
        this.idJogoInstancia = idJogoInstancia;
    }

    public Long getIdDonoDoJogo() {
        return this.idDonoDoJogo;
    }

    public void setIdDonoDoJogo(Long idDonoDoJogo) {
        this.idDonoDoJogo = idDonoDoJogo;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getDataDeDevolucao() {
        return this.dataDeDevolucao;
    }

    public void setDataDeDevolucao(LocalDate dataDeDevolucao) {
        this.dataDeDevolucao = dataDeDevolucao;
    }

}
