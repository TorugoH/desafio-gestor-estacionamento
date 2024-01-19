package com.sistem.gereciadorEstacoinamento.repository;

import com.sistem.gereciadorEstacoinamento.model.Veiculo;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class VeiculoRepositoryTest {

    @Autowired
    VeiculoRepository veiculoRepository;
    @Test
    @DisplayName("Verifica se retorna o veiculo selecionado")
    void findOneVeiculoSucesso() {
        //Veiculo result = this.veiculoRepository.findOneVeiculo(1);
       // assertThat(result.isPresent()).isTrue();
    }

}