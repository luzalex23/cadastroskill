package com.cadastroskills.luzcoder.cadastroskill.dtos;

import com.cadastroskills.luzcoder.cadastroskill.model.UsuarioModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
public class UsuarioDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String nome;
    private String email;
    private String profissao;
    private String telefone;

    public UsuarioDTO(UsuarioModel usuario) {
        super();
        this.id = usuario.getId();
        this.nome = usuario.getNome();
        this.email = usuario.getEmail();
        this.profissao = usuario.getProfissao();
        this.telefone = usuario.getTelefone();
    }
}
