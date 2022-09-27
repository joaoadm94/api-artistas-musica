package br.com.ada.banco.artistasmusica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ada.banco.artistasmusica.entity.Artista;

@Repository
public interface ArtistaRepository extends JpaRepository<Artista, Long> {
    

}
