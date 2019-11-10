package com.trocaae.application.controller;

import com.trocaae.application.model.dto.JogoInstanciaDTO;
import com.trocaae.application.model.sql.JogoInstancia;
import com.trocaae.application.service.JogoInstanciaService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.ResponseEntity.ok;

@Controller
@RequestMapping("jogo-instancia/")
public class JogoInstanciaController {

    @Autowired
    private JogoInstanciaService jogoInstanciaService;

    @PostMapping("criar")
    public ResponseEntity<JogoInstancia> criarJogoInstancia(@RequestBody JogoInstanciaDTO request) throws NotFoundException {
        JogoInstancia jogoInstancia = this.jogoInstanciaService.create(request);
        return ok(jogoInstancia);
    }

    @GetMapping("view/{jogoInstanciaId}")
    public ResponseEntity<JogoInstancia> visualizarJogoInstancia(@PathVariable("jogoInstanciaId") Long jogoInstanciaId) throws NotFoundException {
        JogoInstancia jogoInstancia = this.jogoInstanciaService.view(jogoInstanciaId);
        return ok(jogoInstancia);
    }

    @DeleteMapping("delete/{jogoInstanciaId}")
    public ResponseEntity<String> deleteJogoInstancia(@PathVariable("jogoInstanciaId") Long jogoInstanciaId) {
        return ok(this.jogoInstanciaService.delete(jogoInstanciaId));
    }

}
