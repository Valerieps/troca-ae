package com.trocaae.application.model.sql;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "data_de_nascimento")
    private LocalDate dataDeNascimento;

    @Column(name = "esta_bloqueado")
    private Boolean estaBloqueado;

    @Column(name = "matricula")
    private String matricula;

    private String predios;

    public Long getId() {
        return id;
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

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getPredios(){
        return predios;
    }

    public void setPredios(String predios){
        this.predios = predios;
    }
}
