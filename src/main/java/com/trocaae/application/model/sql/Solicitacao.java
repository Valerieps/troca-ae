package com.trocaae.application.model.sql;

import com.trocaae.application.model.util.Status;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Solicitacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_jogo_instancia")
    private JogoInstancia jogoInstancia;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_solicitante")
    private Usuario solicitante;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private Status status;

    @Column(name = "data_de_devolucao")
    private LocalDate dataDeDevolucao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public JogoInstancia getJogoInstancia() {
        return jogoInstancia;
    }

    public void setJogoInstancia(JogoInstancia jogoInstancia) {
        this.jogoInstancia = jogoInstancia;
    }

    public Usuario getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(Usuario solicitante) {
        this.solicitante = solicitante;
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
