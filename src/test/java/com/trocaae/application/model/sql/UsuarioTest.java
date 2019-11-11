package com.trocaae.application.model.sql;

import org.junit.Test;
import java.time.LocalDate;
import static junit.framework.TestCase.*;

public class UsuarioTest {

    @Test
    public void testSetAndGetName(){
        Usuario usuario = new Usuario();
        String nome = "Alberto Soares";
        usuario.setName(nome);

        assertEquals(usuario.getName(), nome);
    }

    @Test
    public void testSetAndGetEmail(){
        Usuario usuario = new Usuario();
        String email = "alberto@email.com.br";
        usuario.setEmail(email);

        assertEquals(usuario.getEmail(), email);
    }

    @Test
    public void testSetAndGetDataDeNascimento(){
        Usuario usuario = new Usuario();
        LocalDate today = LocalDate.now();
        usuario.setDataDeNascimento(today);

        assertEquals(usuario.getDataDeNascimento(), today);
    }

    @Test
    public void testSetAndGetEstaBloqueado(){
        Usuario usuario = new Usuario();
        usuario.setEstaBloqueado(true);

        assertTrue(usuario.getEstaBloqueado());
    }

    @Test
    public void testSetAndGetMAtricula(){
        Usuario usuario = new Usuario();
        String matricula = "12346/2019";
        usuario.setMatricula(matricula);

        assertEquals(usuario.getMatricula(), matricula);
    }

    @Test
    public void testSetAndGetPredios(){
        Usuario usuario = new Usuario();
        String predios = "ICEX";
        usuario.setPredios(predios);

        assertEquals(usuario.getMatricula(), predios);
    }

}