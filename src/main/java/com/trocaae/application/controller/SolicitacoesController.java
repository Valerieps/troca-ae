package com.trocaae.application.controller;


import com.trocaae.application.service.SolicitacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("usuario/")
public class SolicitacoesController {

    @Autowired
    private SolicitacaoService solicitacaoService;

    @PostMapping
    @PutMapping("{solicatacaoId}")
    public ResponseEntity<String> aceitarSolicitacao(@PathVariable("solicatacaoId") Long solicatacaoId){
        this.solicitacaoService.aceitarSolicitacao(solicatacaoId);
        return ResponseEntity.ok("Solicitação Aprovada!");
    }
}
