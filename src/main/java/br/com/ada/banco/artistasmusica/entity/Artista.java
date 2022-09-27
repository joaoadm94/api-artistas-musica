package br.com.ada.banco.artistasmusica.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Artista {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long artistaId;
    private String nome;
    private TipoArtista tipoArtista;
    private Pais pais;
    private List<Genero> generos;
    private LocalDate inicioAtividade;
    private LocalDate fimAtividade;
    private List<Artista> integrantes;
    private String biografia;
    private String website;
}
