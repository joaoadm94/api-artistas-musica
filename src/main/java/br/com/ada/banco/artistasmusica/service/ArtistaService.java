package br.com.ada.banco.artistasmusica.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.com.ada.banco.artistasmusica.entity.Artista;

public interface ArtistaService {
    
    Artista save(Artista artista, Long usuarioId);

    void delete(Long artistaId);

    Page<Artista> findAll(String filtro, Pageable pageable);

    Artista getById(Long id);
}
