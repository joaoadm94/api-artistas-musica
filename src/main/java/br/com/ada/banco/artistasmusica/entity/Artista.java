package br.com.ada.banco.artistasmusica.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Artista {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @ManyToOne
    @JoinColumn(name = "tipo_artista_id")
    private TipoArtista tipoArtista;
    @ManyToOne
    @JoinColumn(name = "pais_id")
    private Pais pais;
    @ManyToMany
    @JoinTable(name = "artista_genero")
    private List<Genero> generos;
    private LocalDate inicioAtividade;
    private LocalDate fimAtividade;
    @ManyToMany
    private List<Artista> integrantes;
    private String biografia;
    private String website;
}
