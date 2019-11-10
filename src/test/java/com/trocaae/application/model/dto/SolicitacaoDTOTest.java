package com.trocaae.application.model.dto;

import com.trocaae.application.model.util.Status;
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

        solicitacao.setIdSolicitante(idDonoDoJogo);

        assertNotNull(solicitacao.getIdSolicitante());
    }

    @Test
    public void validarGetIdDonoDoJogo(){
        Long idDonoDoJogo = 4321L;
        Long resultado;
        SolicitacaoDTO solicitacao = new SolicitacaoDTO();
        solicitacao.setIdSolicitante(idDonoDoJogo);

        resultado = solicitacao.getIdSolicitante();

        assertEquals(resultado, idDonoDoJogo);
    }

    @Test
    public void validarSetSatus(){
        SolicitacaoDTO solicitacao = new SolicitacaoDTO();
        solicitacao.setStatus(Status.AGUARDANDO_APROVACAO);
        assertNotNull(solicitacao.getStatus());
    }

    @Test
    public void validarGetStatus(){
        SolicitacaoDTO solicitacao = new SolicitacaoDTO();
        solicitacao.setStatus(Status.AGUARDANDO_APROVACAO);
        solicitacao.getStatus();
        assertEquals(solicitacao.getStatus(), Status.AGUARDANDO_APROVACAO);
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
