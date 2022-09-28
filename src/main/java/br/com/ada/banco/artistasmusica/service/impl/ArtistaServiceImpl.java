package br.com.ada.banco.artistasmusica.service.impl;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.ExampleMatcher.StringMatcher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.ada.banco.artistasmusica.entity.Artista;
import br.com.ada.banco.artistasmusica.repository.ArtistaRepository;
import br.com.ada.banco.artistasmusica.service.ArtistaService;

@Service
public class ArtistaServiceImpl implements ArtistaService {

    final ArtistaRepository artistaRepository;

    public ArtistaServiceImpl(ArtistaRepository artistaRepository) {
        this.artistaRepository = artistaRepository;
    }

    @Override
    @Transactional
    public Artista save(Artista artista, Long usuarioId) {
        return artistaRepository.save(artista);
    }

    @Override
    @Transactional
    public void delete(Long artistaId) {
        artistaRepository.deleteById(artistaId);        
    }

    @Override
    @Transactional(readOnly = true)
    public Page<Artista> findAll(String filtro, Pageable pageable) {
        Artista artista = new Artista();
        artista.setNome(filtro);

        final ExampleMatcher exampleMatcher = 
                ExampleMatcher
                .matchingAny()
                .withIgnoreCase()
                .withStringMatcher(StringMatcher.CONTAINING);
        Example<Artista> artistaExample = Example.of(artista, exampleMatcher);
    
        return artistaRepository.findAll(artistaExample, pageable);
    }

    @Override
    @Transactional
    public Artista getById(Long id) {
        return artistaRepository.findById(id).get();
    }
}
