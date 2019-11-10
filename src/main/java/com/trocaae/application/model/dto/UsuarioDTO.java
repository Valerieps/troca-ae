package com.trocaae.application.model.dto;

import java.time.LocalDate;

public class UsuarioDTO {

    private String matricula;
    private String name;
    private String email;
    private LocalDate dataDeNascimento;
    private Boolean estaBloqueado;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public Boolean getEstaBloqueado() {
        return estaBloqueado;
    }

    public void setEstaBloqueado(Boolean estaBloqueado) {
        this.estaBloqueado = estaBloqueado;
    }
}
