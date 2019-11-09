package com.trocaae.application.model.sql;

import com.trocaae.application.model.util.Status;
import org.junit.Test;
import java.time.LocalDate;
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
        Usuario dono = new Usuario();
        dono.setName("Giow Martinelli");
        jogo.setDonoDoJogo(dono);

        solic.setJogoInstancia(jogo);

        assertEquals(solic.getJogoInstancia().getDonoDoJogo(), jogo.getDonoDoJogo());
    }

    @Test
    public void testSetAndGetSolicitante(){
        Solicitacao solic = new Solicitacao();

        Usuario solicitante = new Usuario();
        solicitante.setName("Giow Martinelli");

        solic.setSolicitante(solicitante);

        assertEquals(solic.getSolicitante().getName(), solicitante.getName());
    }

    @Test
    public void testSetAndGetStatus(){
        Solicitacao solic = new Solicitacao();
        Status status = Status.AGUARDANDO_APROVACAO;
        solic.setStatus(status);
        assertEquals(solic.getStatus(),status);
    }

    @Test
    public void testSetAndGetDataDeDevolucao(){
        Solicitacao solic = new Solicitacao();
        LocalDate today = LocalDate.now();
        solic.setDataDeDevolucao(today);
        assertEquals(solic.getDataDeDevolucao(), today);
    }
}
