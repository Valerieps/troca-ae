package com.trocaae.application.model.dto;

public class JogoPerfilDTO {

    private String titulo;
    private String classificacaoIndicativa;
    private String publisher;

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
}
