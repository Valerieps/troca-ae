package com.trocaae.application.model.sql;

import com.trocaae.application.model.util.Status;

import javax.persistence.*;

@Entity
public class JogoInstancia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_perfil")
    private JogoPerfil jogoPerfil;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_dono_do_jogo")
    private Usuario donoDoJogo;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_locatario")
    private Usuario locatario;

    private Status situacao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public JogoPerfil getJogoPerfil() {
        return jogoPerfil;
    }

    public void setJogoPerfil(JogoPerfil jogoPerfil) {
        this.jogoPerfil = jogoPerfil;
    }

    public Usuario getDonoDoJogo() {
        return donoDoJogo;
    }

    public void setDonoDoJogo(Usuario donoDoJogo) {
        this.donoDoJogo = donoDoJogo;
    }

    public Usuario getLocatario() {
        return locatario;
    }

    public void setLocatario(Usuario locatario) {
        this.locatario = locatario;
    }

    public Status getSituacao() {
        return situacao;
    }

    public void setSituacao(Status situacao) {
        this.situacao = situacao;
    }
}
