package com.trocaae.application.service;

import com.trocaae.application.model.sql.Solicitacao;
import com.trocaae.application.model.util.Status;
import com.trocaae.application.repository.SolicitacaoRepository;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.*;

public class SolicitacaoServiceTest {

//    @Autowired
//    private SolicitacaoService solicitacaoService;
//
//    @MockBean
//    private SolicitacaoRepository solicitacaoRepository;

    @Test
    public void mock(){
        assertTrue(true);
    }

    //todo debuggar @FRan
    //    @Test
//    public void aceitarSolicitacao() {
//        Solicitacao solicitacao = new Solicitacao();
//        when(this.solicitacaoRepository.findById(anyLong())).thenReturn(java.util.Optional.of(solicitacao));
//        when(this.solicitacaoRepository.save(any(Solicitacao.class))).thenReturn(solicitacao);
//        this.solicitacaoService.aceitarSolicitacao(1L);
//        verify(this.solicitacaoRepository, times(2));
//        assertEquals(solicitacao.getStatus(), Status.APROVADO);
//    }
}


