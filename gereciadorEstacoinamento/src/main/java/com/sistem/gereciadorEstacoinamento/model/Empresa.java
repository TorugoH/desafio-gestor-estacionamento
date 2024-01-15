package com.sistem.gereciadorEstacoinamento.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private  Integer Id;
    @Column(length = 50)
    private  String nome;
    private  String cnpj;
    @Column(length = 10)
    private String telefone;
    @Column(length = 30)
    private  String endereco;
    private int qtdVagasMotos;
    private  int  qtdVagasCarros;

    @Column(name = "veiculo")
    @OneToMany(mappedBy="empresa")
    private List<Veiculo> veiculo;
}
