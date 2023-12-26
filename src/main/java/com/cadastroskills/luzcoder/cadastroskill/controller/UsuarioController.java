package com.cadastroskills.luzcoder.cadastroskill.controller;

import com.cadastroskills.luzcoder.cadastroskill.dtos.UsuarioDTO;
import com.cadastroskills.luzcoder.cadastroskill.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    private final UsuarioService usuarioService;

    @Autowired
    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<UsuarioDTO> getUsuario(@PathVariable Long id) {
        UsuarioDTO usuarioDTO = usuarioService.getUsuarioDTO(id);
        return ResponseEntity.ok(usuarioDTO);
    }

    @PostMapping
    public ResponseEntity<UsuarioDTO> createUsuario(@RequestBody UsuarioDTO usuarioDTO) {
        UsuarioDTO createdUsuarioDTO = usuarioService.createUsuario(usuarioDTO);
        return new ResponseEntity<>(createdUsuarioDTO, HttpStatus.CREATED);
    }

}
