package com.trocaae.application.model.dto;

import org.junit.Test;
import java.time.LocalDate;
import static junit.framework.TestCase.*;

public class UsuarioDTOTest {
    @Test
    public void validarSetMatricula(){
        String matriculaUsuario = "2016006530";
        UsuarioDTO usuario = new UsuarioDTO();

        usuario.setMatricula(matriculaUsuario);

        assertNotNull(usuario.getMatricula());
    }

    @Test
    public void validarGetMatricula(){
        String matriculaUsuario = "2016006530";
        String resultado;
        UsuarioDTO usuario = new UsuarioDTO();
        usuario.setMatricula(matriculaUsuario);

        resultado = usuario.getMatricula();

        assertEquals(matriculaUsuario, resultado);
    }

    @Test
    public void validarSetNome(){
        String nomeUsuario = "Eduardo Figueiredo";
        UsuarioDTO usuario = new UsuarioDTO();

        usuario.setName(nomeUsuario);

        assertNotNull(usuario.getName());
    }

    @Test
    public void validarGetNome(){
        String nomeUsuario = "Eduardo Figueiredo";
        String resultado;
        UsuarioDTO usuario = new UsuarioDTO();
        usuario.setName(nomeUsuario);

        resultado = usuario.getName();

        assertEquals(nomeUsuario, resultado);
    }

    @Test
    public void validarSetEmail(){
        String emailUsuario = "fiqueiredo@dcc.ufmg.br";
        UsuarioDTO usuario = new UsuarioDTO();

        usuario.setEmail(emailUsuario);

        assertNotNull(usuario.getEmail());
    }

    @Test
    public void validarGetEmail(){
        String emailUsuario = "fiqueiredo@dcc.ufmg.br";
        String result;
        UsuarioDTO usuario = new UsuarioDTO();
        usuario.setEmail(emailUsuario);

        result = usuario.getEmail();

        assertEquals(emailUsuario, result);
    }

    @Test
    public void validarSetDataNascimento(){
        LocalDate dtNascimentoUsuario = LocalDate.of(2019, 11, 10);
        UsuarioDTO usuario = new UsuarioDTO();

        usuario.setDataDeNascimento(dtNascimentoUsuario);

        assertNotNull(usuario.getDataDeNascimento());
    }

    @Test
    public void validarGetDataNascimento(){
        LocalDate dtNascimentoUsuario = LocalDate.of(2019, 11, 10);
        LocalDate resultado;
        UsuarioDTO usuario = new UsuarioDTO();
        usuario.setDataDeNascimento(dtNascimentoUsuario);

        resultado = usuario.getDataDeNascimento();

        assertEquals(dtNascimentoUsuario, resultado);
    }

    @Test
    public void validarSetBloqueio(){
        Boolean usuarioBloqueado = true;
        UsuarioDTO usuario = new UsuarioDTO();

        usuario.setEstaBloqueado(usuarioBloqueado);

        assertNotNull(usuario.getEstaBloqueado());
    }

    @Test
    public void validarGetBloqueio(){
        Boolean usuarioBloqueado = true;
        UsuarioDTO usuario = new UsuarioDTO();

        usuario.setEstaBloqueado(usuarioBloqueado);

        assertTrue(usuario.getEstaBloqueado());
    }
}
