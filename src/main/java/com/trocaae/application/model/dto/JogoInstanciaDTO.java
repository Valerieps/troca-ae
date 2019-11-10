package com.trocaae.application.model.dto;

public class JogoInstanciaDTO {

    private Long idJogoPerfil;
    private Long idDonoDoJogo;
    private Long idLocatario;

    public Long getIdJogoPerfil() {
        return idJogoPerfil;
    }

    public void setIdJogoPerfil(Long idJogoPerfil) {
        this.idJogoPerfil = idJogoPerfil;
    }

    public Long getIdDonoDoJogo() {
        return idDonoDoJogo;
    }

    public void setIdDonoDoJogo(Long idDonoDoJogo) {
        this.idDonoDoJogo = idDonoDoJogo;
    }

    public Long getIdLocatario() {
        return idLocatario;
    }

    public void setIdLocatario(Long idLocatario) {
        this.idLocatario = idLocatario;
    }
}
