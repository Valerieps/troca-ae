package com.trocaae.application.model.sql;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Plataforma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
}
