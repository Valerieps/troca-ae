package com.trocaae.application.repository;

import com.trocaae.application.model.sql.JogoPerfil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JogoPerfilRepository extends JpaRepository<JogoPerfil, Long> {
    // This interface is intentionally left blank

}
