package com.trocaae.application.model.sql;


import org.junit.Test;
import java.time.LocalDate;
import java.util.*;
import static junit.framework.TestCase.*;

public class SolicitacaoTest {

    @Test
    public void testSetAndGetID(){
        Solicitacao solic = new Solicitacao();
        Long id = 10L;
        solic.setId(id);

        assertEquals(solic.getId(), id);
    }

    @Test
    public void testSetAndGetJogoInstancia(){
        Solicitacao solic = new Solicitacao();
        JogoInstancia jogo = new JogoInstancia();
        jogo.se


//        assertEquals(solic.getId(), id);
    }

}

//    public JogoInstancia getJogoInstancia() {
//        return jogoInstancia;
//    }
//
//    public void setJogoInstancia(JogoInstancia jogoInstancia) {
//        this.jogoInstancia = jogoInstancia;
//    }
//
//    public Usuario getSolicitante() {
//        return solicitante;
//    }
//
//    public void setSolicitante(Usuario solicitante) {
//        this.solicitante = solicitante;
//    }
//
//    public Status getStatus() {
//        return status;
//    }
//
//    public void setStatus(Status status) {
//        this.status = status;
//    }
//
//    public LocalDate getDataDeDevolucao() {
//        return dataDeDevolucao;
//    }
//
//    public void setDataDeDevolucao(LocalDate dataDeDevolucao) {
//        this.dataDeDevolucao = dataDeDevolucao;
//    }