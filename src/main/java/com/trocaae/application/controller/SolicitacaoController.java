package com.trocaae.application.controller;


import com.trocaae.application.model.dto.SolicitacaoDTO;
import com.trocaae.application.service.SolicitacaoService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("solicitacao/")
public class SolicitacaoController {

    @Autowired
    private SolicitacaoService solicitacaoService;

    @PutMapping("aprovar/{solicatacaoId}")
    public ResponseEntity<String> aceitarSolicitacao(@PathVariable("solicatacaoId") Long solicatacaoId) {
        this.solicitacaoService.aceitarSolicitacao(solicatacaoId);
        return ResponseEntity.ok("Solicitação Aprovada!");
    }

    @PutMapping("recusar/{solicatacaoId}")
    public ResponseEntity<String> recusarSolicitacao(@PathVariable("solicatacaoId") Long solicatacaoId) {
        this.solicitacaoService.recusarSolicitacao(solicatacaoId);
        return ResponseEntity.ok("Solicitação Recusada!");
    }

    @PutMapping("emEmprestimo/{solicatacaoId}/")
    public ResponseEntity<String> emEmprestimo(@PathVariable("solicatacaoId") Long solicatacaoId) {
        this.solicitacaoService.emEmprestimo(solicatacaoId);
        return ResponseEntity.ok("Solicitação Aprovada!");
    }

    @PostMapping("create/")
    public ResponseEntity<String> criarNovaSolicitacao(@RequestBody SolicitacaoDTO solicitacaoDTO) throws NotFoundException {
        this.solicitacaoService.create(solicitacaoDTO);
        return ResponseEntity.ok("Solicitação Aprovada!");
    }

    @PutMapping("editar/")
    public ResponseEntity<String> editarSolicitacao(@PathVariable("solicatacaoId") Long solicatacaoId) {
        this.solicitacaoService.aceitarSolicitacao(solicatacaoId);
        return ResponseEntity.ok("Solicitação Aprovada!");
    }

    @PutMapping("{solicatacaoId}/")
    public ResponseEntity<String> removerSituacao(@PathVariable("solicatacaoId") Long solicatacaoId) {
        this.solicitacaoService.aceitarSolicitacao(solicatacaoId);
        return ResponseEntity.ok("Solicitacao remover");
    }
}
