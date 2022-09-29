package br.com.ada.banco.artistasmusica.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Nome {
    @JsonProperty("abreviado")
    private String nome;
}
