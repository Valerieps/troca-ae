package com.trocaae.application.repository;

import com.trocaae.application.model.sql.Solicitacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SolicitacaoRepository extends JpaRepository<Solicitacao, Long> {

}


