package com.sistem.gereciadorEstacoinamento.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Entity
@Getter
@Setter
public class Gestor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private Integer Id;
    private String placa;
    private String dataEntrada;
    private String horaEntrada;
    private String dataSaida;
    private String horaSaida;


}
