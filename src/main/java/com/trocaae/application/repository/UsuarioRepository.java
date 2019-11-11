package com.trocaae.application.repository;

import com.trocaae.application.model.sql.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    // This interface is intentionally left blank
}
