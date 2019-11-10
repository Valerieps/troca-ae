package com.trocaae.application.controller;

import com.trocaae.application.model.dto.JogoInstanciaDTO;
import com.trocaae.application.model.dto.PlataformaDTO;
import com.trocaae.application.model.sql.JogoInstancia;
import com.trocaae.application.model.sql.Plataforma;
import com.trocaae.application.service.JogoInstanciaService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.ResponseEntity.ok;

@Controller
@RequestMapping("jogo-instancia/")
public class JogoInstanciaController {

    @Autowired
    private JogoInstanciaService jogoInstanciaService;

    @PostMapping("criar")
    public ResponseEntity<JogoInstancia> criarPLataformas(@RequestBody JogoInstanciaDTO request) throws NotFoundException {
        JogoInstancia jogoInstancia = this.jogoInstanciaService.create(request);
        return ok(jogoInstancia);
    }

    @GetMapping("view/{jogoInstanciaId}")
    public ResponseEntity<JogoInstancia> visualizarPlataforma(@PathVariable("jogoInstanciaId") Long jogoInstanciaId) throws NotFoundException {
        JogoInstancia jogoInstancia = this.jogoInstanciaService.view(jogoInstanciaId);
        return ok(jogoInstancia);
    }

    @DeleteMapping("delete/{jogoInstanciaId}")
    public ResponseEntity<String> deletePlataforma(@PathVariable("jogoInstanciaId") Long jogoInstanciaId) {
        return ok(this.jogoInstanciaService.delete(jogoInstanciaId));
    }

}
