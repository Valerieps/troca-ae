package com.trocaae.application.service;

import com.trocaae.application.model.dto.SolicitacaoDTO;
import com.trocaae.application.model.sql.Solicitacao;
import com.trocaae.application.model.util.Status;
import com.trocaae.application.repository.SolicitacaoRepository;
import javassist.NotFoundException;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class SolicitacaoService {

    private SolicitacaoRepository repository;

    private JogoInstanciaService jogoInstanciaService;

    private UsuarioService usuarioService;

    public SolicitacaoService(SolicitacaoRepository repository) {
        this.repository = repository;
    }

    public void aceitarSolicitacao(Long solicatacaoId) {
        updateStatus(solicatacaoId, Status.APROVADO);
    }

    public void recusarSolicitacao(Long solicatacaoId) {
        updateStatus(solicatacaoId, Status.RECUSADO);
    }

    private void updateStatus(Long solicatacaoId, Status status) {
        Optional<Solicitacao> solicitacao = this.repository.findById(solicatacaoId);
        solicitacao.ifPresent(value -> {
            value.setStatus(status);
            this.repository.save(value);
        });
    }

    public void confirmarEmprestimo(Long solicatacaoId) {
        Optional<Solicitacao> solicitacao = this.repository.findById(solicatacaoId);
        solicitacao.ifPresent(value -> {
            try {
                value.setStatus(Status.EM_EMPRESTIMO);
                value.setDataDeDevolucao(LocalDate.now().plusDays(7));
                this.jogoInstanciaService.update(value.getJogoInstancia().getId(), value.getSolicitante().getId());
            } catch (NotFoundException e) {
                e.printStackTrace();
            }
            this.repository.save(value);
        });
    }

    public Solicitacao criarNovaSolicitacao(SolicitacaoDTO solicitacaoDTO) throws NotFoundException {
        Solicitacao solicitacao = new Solicitacao();
        solicitacao.setStatus(Status.AGUARDANDO_APROVACAO);
        solicitacao.setJogoInstancia(this.jogoInstanciaService.getJogoInstancia(solicitacaoDTO.getIdJogoInstancia()));
        solicitacao.setSolicitante(this.usuarioService.getUsuario(solicitacaoDTO.getIdSolicitante()));
        return this.repository.save(solicitacao);
    }

    public Solicitacao atualizarSolicitacao(Long plataformaId, SolicitacaoDTO solicitacaoDTO) throws NotFoundException {
        Solicitacao solicitacao = this.repository.findById(plataformaId)
                .orElseThrow(() -> new NotFoundException("Plataforma não encontrado"));
        if (solicitacaoDTO.getDataDeDevolucao() != null)
            solicitacao.setDataDeDevolucao(solicitacaoDTO.getDataDeDevolucao());
        if (solicitacaoDTO.getStatus() != null)
            solicitacao.setStatus(solicitacaoDTO.getStatus());
        return this.repository.save(solicitacao);
    }

    public Solicitacao visualizarSolicitacao(Long solicitacaoId) throws NotFoundException {
        return this.repository.findById(solicitacaoId)
                .orElseThrow(() -> new NotFoundException("Solicitação não encontrado"));
    }

    public List<Solicitacao> visualizarTodasSolicitacoes() {
        return this.repository.findAll();
    }

    public String deletarSolicitacao(Long solicitacaoId) {
        this.repository.deleteById(solicitacaoId);
        return "Solicitação com id: " + solicitacaoId + " deletado com sucesso";
    }

    public List<Solicitacao> buscarSolicitacaoPorUsuario(Long usuarioId) {
        return this.repository.findAllBySolicitanteId(usuarioId);
    }
}




