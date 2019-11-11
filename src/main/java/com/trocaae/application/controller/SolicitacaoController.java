package com.trocaae.application.controller;


import com.trocaae.application.model.dto.SolicitacaoDTO;
import com.trocaae.application.model.sql.Solicitacao;
import com.trocaae.application.service.SolicitacaoService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("solicitacao/")
public class SolicitacaoController {

    @Autowired
    private SolicitacaoService solicitacaoService;

    @PostMapping("create/")
    public ResponseEntity<Solicitacao> criarNovaSolicitacao(@RequestBody SolicitacaoDTO solicitacaoDTO) throws NotFoundException {
        return ResponseEntity.ok(this.solicitacaoService.criarNovaSolicitacao(solicitacaoDTO));
    }

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
    public ResponseEntity<String> confirmarEmprestimo(@PathVariable("solicatacaoId") Long solicatacaoId) {
        this.solicitacaoService.confirmarEmprestimo(solicatacaoId);
        return ResponseEntity.ok("Solicitação Aprovada!");
    }

    @DeleteMapping("{solicatacaoId}/")
    public ResponseEntity<String> removerSituacao(@PathVariable("solicatacaoId") Long solicatacaoId) {
        return ResponseEntity.ok(this.solicitacaoService.deletarSolicitacao(solicatacaoId));
    }

    @GetMapping("usuario/{usuarioId}")
    public ResponseEntity<List<Solicitacao>> buscarSolicitacoesPorUsuario(@PathVariable("usuarioId") Long usuarioId){
        List<Solicitacao> solicitacaos = this.solicitacaoService.buscarSolicitacaoPorUsuario(usuarioId);
        return ResponseEntity.ok(solicitacaos);
    }


}
