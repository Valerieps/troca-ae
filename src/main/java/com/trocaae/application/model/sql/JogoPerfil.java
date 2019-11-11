package com.trocaae.application.model.sql;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class JogoPerfil {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "classificacao_indicativa")
    private String classificacaoIndicativa;

    @Column(name = "publisher")
    private String publisher;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Plataforma> plataformas = new ArrayList<>();

    //Methods
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getClassificacaoIndicativa() {
        return classificacaoIndicativa;
    }

    public void setClassificacaoIndicativa(String classificacaoIndicativa) {
        this.classificacaoIndicativa = classificacaoIndicativa;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public List<Plataforma> getPlataformas() {
        return plataformas;
    }

    public void removePlataforma(Plataforma plataforma) {
        this.plataformas.remove(plataforma);
    }

    public void adicionaPlataforma(Plataforma plataformas) {
        this.plataformas.add(plataformas);
    }
}
