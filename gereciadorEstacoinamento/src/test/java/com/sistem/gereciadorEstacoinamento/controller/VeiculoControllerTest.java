package com.sistem.gereciadorEstacoinamento.controller;

import com.sistem.gereciadorEstacoinamento.model.Empresa;
import com.sistem.gereciadorEstacoinamento.model.Veiculo;
import com.sistem.gereciadorEstacoinamento.repository.VeiculoRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(MockitoExtension.class)
@WebMvcTest(VeiculoController.class)
class VeiculoControllerTest {
    @Autowired
    @Mock
    VeiculoController veiculoController;

    @Mock
    VeiculoRepository veiculoRepository;

    private MockMvc mokvcs;
    private String json;
    private Veiculo veiculo;

    @BeforeEach
    public  void setup(){
        mokvcs = MockMvcBuilders.standaloneSetup(veiculoController).alwaysDo(print()).build();
        Veiculo veiculo= new Veiculo("bmw", "ix", "Preta", "oqp","passeio","21-01-2024","10:00","21-01-2024","17:00");
    }
   @Test
   @DisplayName("Verifica se os veiculos estao sendo salvos de maneira correta")
   void criaRegistroVeiculo() throws Exception {
      when(veiculoController.cadastrarVeiculo(veiculo)).thenReturn("ok");
        mokvcs.perform(post("/veiculo/registrarEntrada")
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
       verify(veiculoController).cadastrarVeiculo(veiculo);
   }
   

}