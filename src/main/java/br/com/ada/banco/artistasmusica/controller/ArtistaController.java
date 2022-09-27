package br.com.ada.banco.artistasmusica.controller;

import javax.validation.Valid;

import org.springdoc.api.annotations.ParameterObject;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.ada.banco.artistasmusica.entity.Artista;
import br.com.ada.banco.artistasmusica.service.ArtistaService;

@RestController
@RequestMapping("/artistas")
public class ArtistaController {

    final ArtistaService artistaService;

    public ArtistaController(ArtistaService artistaService) {
        this.artistaService = artistaService;
    }

    @GetMapping
    public ResponseEntity<Page<Artista>> findAll(@RequestParam(value = "filter", required = false) String filter, 
                                                 @ParameterObject @PageableDefault(size = 20, page = 0) Pageable pageable){
        return ResponseEntity.ok(artistaService.findAll(filter, pageable));
    }
    
    @PostMapping
    public ResponseEntity<Artista> save(@Valid @RequestBody Artista artista, 
                                        @RequestParam(value = "usuario", required = true) Long usuarioId){
        return ResponseEntity.ok(artistaService.save(artista, usuarioId));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Artista> getById(@PathVariable("id") Long artistaId){
        return ResponseEntity.ok(artistaService.getById(artistaId));
    }
}
