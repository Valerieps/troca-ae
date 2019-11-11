package com.trocaae.application.controller;

import com.trocaae.application.model.dto.UsuarioDTO;
import com.trocaae.application.model.sql.Usuario;
import com.trocaae.application.service.UsuarioService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.ResponseEntity.ok;

@Controller
@RequestMapping("usuario/")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("cadastro")
    public ResponseEntity<Usuario> criarUsuario(@RequestBody UsuarioDTO request) {
        Usuario usuario = this.usuarioService.create(request);
        return ok(usuario);
    }

    @PostMapping("editar/{usuarioId}")
    public ResponseEntity<Usuario> atualizarUsuario(@PathVariable("usuarioId") Long usuarioId, @RequestBody UsuarioDTO request) throws NotFoundException {
        Usuario usuario = this.usuarioService.update(usuarioId, request);
        return ok(usuario);
    }

    @GetMapping("view/{usuarioId}")
    public ResponseEntity<Usuario> visualizarUsuario(@PathVariable("usuarioId") Long usuarioId) throws NotFoundException {
        Usuario usuario = this.usuarioService.view(usuarioId);
        return ok(usuario);
    }

    @DeleteMapping("delete/{usuarioId}")
    public ResponseEntity<String> deleteUsuario(@PathVariable("usuarioId") Long usuarioId) {
        return ok(this.usuarioService.delete(usuarioId));
    }
}
