package br.com.ada.banco.artistasmusica.entity;

import java.time.Duration;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Faixa {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long faixaId;
    private String nome;
    private Genero genero;
    private Artista compositor;
    private Artista produtor;
    private Duration duracao;
}
