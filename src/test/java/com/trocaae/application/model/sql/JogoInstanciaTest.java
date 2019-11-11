package com.trocaae.application.model.sql;

import com.trocaae.application.model.util.Status;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.*;

public class JogoInstanciaTest {

    @Test
    public void testSetAndGetID(){
        JogoInstancia jogo = new JogoInstancia();
        Long id = 10L;
        jogo.setId(id);

        assertEquals(jogo.getId(), id);
    }

    @Test
    public void testGetAndSetJogoPerfil(){
        JogoInstancia jogo = new JogoInstancia();

        JogoPerfil perfil = new JogoPerfil();
        String titulo = "Mario Kart";
        perfil.setTitulo(titulo);

        jogo.setJogoPerfil(perfil);
        assertEquals(jogo.getJogoPerfil().getTitulo(), perfil.getTitulo());
    }

    @Test
    public void testGetAndSetDonoJogo(){
        Usuario dona = new Usuario();
        String nome = "Fran";
        dona.setName(nome);

        JogoInstancia jogo = new JogoInstancia();
        jogo.setDonoDoJogo(dona);

        assertEquals(jogo.getDonoDoJogo().getName(), dona.getName());
    }

    @Test
    public void testGetAndSetLocatario(){
        Usuario locatario = new Usuario();
        String nome = "Valeria";
        locatario.setName(nome);

        JogoInstancia jogo = new JogoInstancia();
        jogo.setLocatario(locatario);

        assertEquals(jogo.getLocatario().getName(), locatario.getName());
    }

    @Test
    public void testSetAndGetStatus(){
        Status status = Status.AGUARDANDO_APROVACAO;

        JogoInstancia jogo = new JogoInstancia();
        jogo.setSituacao(status);

        assertEquals(jogo.getSituacao(),status);
    }
}
