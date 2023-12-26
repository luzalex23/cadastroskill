package com.cadastroskills.luzcoder.cadastroskill.repositories;

import com.cadastroskills.luzcoder.cadastroskill.model.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long> {
    UsuarioModel findByNome(String nome);

}
