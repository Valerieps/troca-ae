package com.trocaae.application.model.sql;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.*;

public class JogoPerfilTest {

    @Test
    public void testSetAndGetID(){
        JogoPerfil jogo = new JogoPerfil();
        Long id = 10L;
        jogo.setId(id);

        assertEquals(jogo.getId(), id);
    }

    @Test
    public void testSetAndGetTitulo(){
        JogoPerfil jogo = new JogoPerfil();
        String titulo = "Mario Kart";
        jogo.setTitulo(titulo);

        assertEquals(jogo.getTitulo(), titulo);
    }

    @Test
    public void testSetAndGetClassIndicativa(){
        JogoPerfil jogo = new JogoPerfil();
        String classificacao = "Free for all";
        jogo.setClassificacaoIndicativa(classificacao);

        assertEquals(jogo.getClassificacaoIndicativa(), classificacao);
    }

    @Test
    public void testSetAndGetPublisher(){
        JogoPerfil jogo = new JogoPerfil();
        String publisher = "Nintendo";
        jogo.setPublisher(publisher);

        assertEquals(jogo.getPublisher(), publisher);
    }

    @Test
    public void testAdicionaPlataformas(){
        JogoPerfil jogo = new JogoPerfil();

        Plataforma plat1 = new Plataforma();
        Plataforma plat2 = new Plataforma();
        Plataforma plat3 = new Plataforma();

        List<Plataforma> plataformas = new ArrayList();
        plataformas.add(plat1);
        plataformas.add(plat2);
        plataformas.add(plat3);

        jogo.adicionaPlataforma(plat1);
        jogo.adicionaPlataforma(plat2);
        jogo.adicionaPlataforma(plat3);

        assertEquals(jogo.getPlataformas(), plataformas);
    }

    @Test
    public void testRemovePlataformas(){
        JogoPerfil jogo = new JogoPerfil();

        Plataforma plat1 = new Plataforma();
        Plataforma plat2 = new Plataforma();

        jogo.adicionaPlataforma(plat1);
        jogo.adicionaPlataforma(plat2);

        jogo.removePlataforma(plat2);

        ArrayList<Plataforma> plataformas = new ArrayList();
        plataformas.add(plat1);

        assertEquals(jogo.getPlataformas(), plataformas);
    }
}
