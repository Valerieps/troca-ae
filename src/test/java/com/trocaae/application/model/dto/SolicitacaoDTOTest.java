package com.trocaae.application.model.dto;

import org.junit.Test;
import java.time.LocalDate;
import static junit.framework.TestCase.*;

public class SolicitacaoDTOTest {
    @Test
    public void validarSetIdJogoInstancia(){
        Long idJogoInstancia = 1234L;
        SolicitacaoDTO solicitacao = new SolicitacaoDTO();

        solicitacao.setIdJogoInstancia(idJogoInstancia);

        assertNotNull(solicitacao.getIdJogoInstancia());
    }

    @Test
    public void validarGetIdJogoInstancia(){
        Long idJogoInstancia = 1234L;
        Long resultado;
        SolicitacaoDTO solicitacao = new SolicitacaoDTO();
        solicitacao.setIdJogoInstancia(idJogoInstancia);

        resultado = solicitacao.getIdJogoInstancia();

        assertEquals(resultado, idJogoInstancia);
    }

    @Test
    public void validarSetIdDonoDoJogo(){
        Long idDonoDoJogo = 4321L;
        SolicitacaoDTO solicitacao = new SolicitacaoDTO();

        solicitacao.setIdDonoDoJogo(idDonoDoJogo);

        assertNotNull(solicitacao.getIdDonoDoJogo());
    }

    @Test
    public void validarGetIdDonoDoJogo(){
        Long idDonoDoJogo = 4321L;
        Long resultado;
        SolicitacaoDTO solicitacao = new SolicitacaoDTO();
        solicitacao.setIdDonoDoJogo(idDonoDoJogo);

        resultado = solicitacao.getIdDonoDoJogo();

        assertEquals(resultado, idDonoDoJogo);
    }

    @Test
    public void validarSetSatus(){
        String status = "Aguardando Aprovação";
        SolicitacaoDTO solicitacao = new SolicitacaoDTO();

        solicitacao.setStatus(status);

        assertNotNull(solicitacao.getStatus());
    }

    @Test
    public void validarGetStatus(){
        String status = "Aguardando Aprovação";
        String resultado;
        SolicitacaoDTO solicitacao = new SolicitacaoDTO();
        solicitacao.setStatus(status);

        resultado = solicitacao.getStatus();

        assertEquals(resultado, status);
    }

    @Test
    public void validarSetDataDevolucao(){
        LocalDate dtDevolucao = LocalDate.of(2019, 11, 10);
        SolicitacaoDTO solicitacao = new SolicitacaoDTO();

        solicitacao.setDataDeDevolucao(dtDevolucao);

        assertNotNull(solicitacao.getDataDeDevolucao());
    }

    @Test
    public void validarGetDataDevolucao(){
        LocalDate dtDevolucao = LocalDate.of(2019, 11, 10);
        LocalDate resultado;
        SolicitacaoDTO solicitacao = new SolicitacaoDTO();
        solicitacao.setDataDeDevolucao(dtDevolucao);

        resultado = solicitacao.getDataDeDevolucao();

        assertEquals(resultado, dtDevolucao);
    }

}
