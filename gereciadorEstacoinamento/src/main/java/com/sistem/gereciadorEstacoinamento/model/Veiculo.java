package com.sistem.gereciadorEstacoinamento.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Veiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private  Integer Id;
    @Column(length = 10)
    private String marca;
    @Column(length = 10)
    private  String modelo;
    @Column(length = 10)
    private  String cor;
    @Column(length = 10)
    private String placa;
    @Column(length = 10)
    private  String tipo;


}
