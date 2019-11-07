package com.trocaae.application.repository;

import com.trocaae.application.model.sql.Solicitacao;
import com.trocaae.application.model.sql.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SolicitacaoRepository extends JpaRepository<Solicitacao, Long> {

}


