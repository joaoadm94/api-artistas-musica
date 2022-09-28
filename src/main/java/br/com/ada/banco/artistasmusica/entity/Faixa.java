package br.com.ada.banco.artistasmusica.entity;

import java.time.Duration;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Faixa {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @OneToOne
    private Genero genero;
    @ManyToMany
    @JoinTable(name = "faixa_compositor")
    private List<Artista> compositor;
    @ManyToMany
    @JoinTable(name = "faixa_produtor")
    private List<Artista> produtor;
    private Duration duracao;
}
