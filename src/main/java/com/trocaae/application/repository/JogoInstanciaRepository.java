package com.trocaae.application.repository;

import com.trocaae.application.model.sql.JogoInstancia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JogoInstanciaRepository extends JpaRepository<JogoInstancia, Long> {
    // This interface is intentionally left blank

}
