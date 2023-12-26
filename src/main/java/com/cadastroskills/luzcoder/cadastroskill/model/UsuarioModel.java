package com.cadastroskills.luzcoder.cadastroskill.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@Builder
@Data
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

public class UsuarioModel implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String email;
    private String profissao;
    private String telefone;




    public UsuarioModel() {
    }

    public UsuarioModel(String nome, String email, String profissao, String telefone) {
        this.nome = nome;
        this.email = email;
        this.profissao = profissao;
        this.telefone = telefone;
    }


}
