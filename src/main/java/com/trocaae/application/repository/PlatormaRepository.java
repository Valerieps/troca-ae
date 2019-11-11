package com.trocaae.application.repository;

import com.trocaae.application.model.sql.Plataforma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlatormaRepository extends JpaRepository<Plataforma, Long> {
    // This interface is intentionally left blank

}
