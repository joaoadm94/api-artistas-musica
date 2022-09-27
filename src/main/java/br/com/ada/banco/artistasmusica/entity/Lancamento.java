package br.com.ada.banco.artistasmusica.entity;

import java.sql.Blob;
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
public class Lancamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long lancamentoId;
    private String nome;
    private TipoLancamento tipoLancamento;
    private LocalDate dataLancamento;
    private String gravadora;
    private Blob arteCapa;
    private List<Faixa> faixas;
}
