package com.trocaae.application.model.sql;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Plataforma {

    // todo @Fran colocar id como private. Se colocar, quebra.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
}
