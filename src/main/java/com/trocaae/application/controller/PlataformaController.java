package com.trocaae.application.controller;

import com.trocaae.application.model.dto.PlataformaDTO;
import com.trocaae.application.model.sql.Plataforma;
import com.trocaae.application.service.PlataformaService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.ResponseEntity.ok;

@Controller
@RequestMapping("plataforma/")
public class PlataformaController {

    @Autowired
    private PlataformaService plataformaService;

    @PostMapping("criar")
    public ResponseEntity<Plataforma> criarPLataformas(@RequestBody PlataformaDTO request) {
        Plataforma plataforma = this.plataformaService.criarNovaPlataforma(request);
        return ok(plataforma);
    }

    @PostMapping("editar/{plataformaId}")
    public ResponseEntity<Plataforma> atualizarPlataformas(@PathVariable("plataformaId") Long plataformaId, @RequestBody PlataformaDTO request) throws NotFoundException {
        Plataforma plataforma = this.plataformaService.atualizarPlataforma(plataformaId, request);
        return ok(plataforma);
    }

    @GetMapping("view/list")
    public ResponseEntity<List<Plataforma>> visualizarListaDePlataformas() {
        List<Plataforma> plataforma = this.plataformaService.visualizarTodasPlataformas();
        return ok(plataforma);
    }

    @GetMapping("view/{plataformaId}")
    public ResponseEntity<Plataforma> visualizarPlataforma(@PathVariable("plataformaId") Long plataformaId) throws NotFoundException {
        Plataforma plataforma = this.plataformaService.visualizarPlataforma(plataformaId);
        return ok(plataforma);
    }

    @DeleteMapping("delete/{plataformaId}")
    public ResponseEntity<String> deletePlataforma(@PathVariable("plataformaId") Long plataformaId) {
        return ok(this.plataformaService.deletarPlataforma(plataformaId));
    }


}
