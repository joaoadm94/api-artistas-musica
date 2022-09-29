package br.com.ada.banco.artistasmusica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ada.banco.artistasmusica.entity.Pais;

@Repository
public interface PaisRepository extends JpaRepository<Pais, Long> {
    
}
