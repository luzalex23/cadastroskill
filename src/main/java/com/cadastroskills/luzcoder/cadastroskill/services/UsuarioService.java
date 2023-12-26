package com.cadastroskills.luzcoder.cadastroskill.services;

import com.cadastroskills.luzcoder.cadastroskill.dtos.UsuarioDTO;
import com.cadastroskills.luzcoder.cadastroskill.model.UsuarioModel;
import com.cadastroskills.luzcoder.cadastroskill.repositories.UsuarioRepository;
import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioService {
    @Autowired
    private final UsuarioRepository usuarioRepository;
    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public UsuarioDTO createUsuario(UsuarioDTO usuarioDTO) {
        UsuarioModel usuario = new UsuarioModel(usuarioDTO.getNome(), usuarioDTO.getEmail(), usuarioDTO.getProfissao(), usuarioDTO.getTelefone());
        UsuarioModel savedUsuario = usuarioRepository.save(usuario);

        return new UsuarioDTO(savedUsuario.getId(), savedUsuario.getNome(), savedUsuario.getEmail(), savedUsuario.getProfissao(), savedUsuario.getTelefone());
    }

    public UsuarioDTO getUsuarioDTO(Long id) {
        Optional<UsuarioModel> obj = usuarioRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(("Objeto não encontrado! Id:" + id + "Tipo" + UsuarioModel.class.getName()));
    }
}

