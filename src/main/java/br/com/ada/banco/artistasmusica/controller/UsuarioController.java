package br.com.ada.banco.artistasmusica.controller;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ada.banco.artistasmusica.entity.Usuario;
import br.com.ada.banco.artistasmusica.service.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping
    public ResponseEntity<Usuario> get(){
        return ResponseEntity.ok(new Usuario());
    }
    
    @PostMapping
    public ResponseEntity<Usuario> save(@Valid @RequestBody Usuario usuario) {
        return ResponseEntity.ok(usuarioService.save(usuario));
    }
    
    @PutMapping
    public ResponseEntity<Usuario> update(@Valid @RequestBody Usuario usuario,
                                          @PathVariable("id") Long usuarioId) {
        return ResponseEntity.ok(usuarioService.update(usuario));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> getById(@PathVariable("id") Long usuarioId) {
        return ResponseEntity.ok(usuarioService.getById(usuarioId));
    }
}
