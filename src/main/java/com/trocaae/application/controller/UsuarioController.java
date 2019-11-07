package com.trocaae.application.controller;

import com.trocaae.application.model.dto.UsuarioDTO;
import com.trocaae.application.model.sql.Usuario;
import com.trocaae.application.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.ResponseEntity.*;

@Controller
@RequestMapping("usuario/")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("cadastro")
    public ResponseEntity<Usuario> create(@RequestBody UsuarioDTO request){
        Usuario usuario = this.usuarioService.create(request);
        return ok(usuario);
    }

    @PostMapping("editar/{usuarioId}")
    public ResponseEntity<Usuario> atualizarPerfil(@PathVariable("usuarioId") Long usuarioId, @RequestBody UsuarioDTO request){

        return null;
    }

    //TODO: metodo para visuaizar um usuario

    @DeleteMapping("{usuarioId}")
    public ResponseEntity<Usuario> deletePerfil(@PathVariable("usuarioId") Long usuarioId){
        //TODO: Metodo que realiza login;
        return null;
    }
}
