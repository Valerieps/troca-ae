package com.trocaae.application.model.sql;

import com.trocaae.application.model.util.Status;

import javax.persistence.*;

@Entity
public class JogoInstancia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_perfil")
    private JogoPerfil jogoPerfil;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_dono_do_jogo")
    private Usuario donoDoJogo;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_locatario")
    private Usuario locatario;

    //Crete enum
    private Status situacao;

}
