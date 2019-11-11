package com.trocaae.application.controller;

import com.trocaae.application.model.dto.JogoPerfilDTO;
import com.trocaae.application.model.sql.JogoPerfil;
import com.trocaae.application.service.JogoPerfilService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.ResponseEntity.ok;

@Controller
@RequestMapping("jogo-perfil/")
public class JogoPerfilController {

    @Autowired
    private JogoPerfilService jogoPerfilService;

    @PostMapping("criar")
    public ResponseEntity<JogoPerfil> criarJogoPerfil(@RequestBody JogoPerfilDTO request) {
        JogoPerfil jogoPerfil = this.jogoPerfilService.criarJogoPerfil(request);
        return ok(jogoPerfil);
    }

    @PostMapping("editar/{jogoPerfilId}")
    public ResponseEntity<JogoPerfil> atualizarPerfil(@PathVariable("jogoPerfilId") Long jogoPerfilId, @RequestBody JogoPerfilDTO request) throws NotFoundException {
        JogoPerfil jogoPerfil = this.jogoPerfilService.atualizarJogoPerfil(jogoPerfilId, request);
        return ok(jogoPerfil);
    }

    @PutMapping("add-plataforma/{jogoPerfilId}/{plataformaId}")
    public ResponseEntity<JogoPerfil> atualizarPerfil(@PathVariable("jogoPerfilId") Long jogoPerfilId, @PathVariable("plataformaId") Long plataformaId) throws NotFoundException {
        JogoPerfil jogoPerfil = this.jogoPerfilService.addPlataforma(jogoPerfilId, plataformaId);
        return ok(jogoPerfil);
    }

    @GetMapping("view/list")
    public ResponseEntity<List<JogoPerfil>> VisualizarListaJogoPerfil() {
        List<JogoPerfil> jogosPerfil = this.jogoPerfilService.viewList();
        return ok(jogosPerfil);
    }

    @GetMapping("view/{jogoPerfilId}")
    public ResponseEntity<JogoPerfil> visualizarJogoPerfil(@PathVariable("jogoPerfilId") Long jogoPerfilId) throws NotFoundException {
        JogoPerfil jogoPerfil = this.jogoPerfilService.visualizarJogoPerfil(jogoPerfilId);
        return ok(jogoPerfil);
    }

    @DeleteMapping("delete/{jogoPerfilId}")
    public ResponseEntity<String> deletePerfil(@PathVariable("jogoPerfilId") Long jogoPerfilId) {
        return ok(this.jogoPerfilService.delete(jogoPerfilId));
    }
}
