package com.sistem.gereciadorEstacoinamento.controller;

import com.sistem.gereciadorEstacoinamento.model.Veiculo;
import com.sistem.gereciadorEstacoinamento.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/veiculo")

public class VeiculoController {
    @Autowired
    VeiculoRepository veiculoRepository;

    @GetMapping
    private List<Veiculo> listarVeiculos(){
        return veiculoRepository.findAll();
    }
    @GetMapping("/registroDosDias")
    private  List<String> registroDia(){
        return  veiculoRepository.findRegistroDias();
    }
    @PostMapping("/registrarEntrada")
    public String cadastrarVeiculo (@RequestBody Veiculo veiculo){

        veiculoRepository.save(veiculo);
        return "Cadastrado";
    }
    @DeleteMapping("{id}")
    private void apagarVeiculo(@PathVariable("id") int id){

        veiculoRepository.deleteById(id);
    }

    @GetMapping("/veiculosEmAberto")
    private List<Veiculo> listarVeiculosEmAberto(){
       return veiculoRepository.findVeiculoEmAberto();
    }

    @PutMapping("/registrarSaida/{id}/{dataSaida}/{horaSaida}")
    private void registrarSaida(@PathVariable("id") Integer id, @PathVariable("dataSaida") String dataSaida, @PathVariable("horaSaida") String horaSaida){
        Veiculo veiculoAtualizar = veiculoRepository.findOneVeiculo(id);
        if (veiculoAtualizar!=null){
            veiculoAtualizar.setDataSaida(dataSaida);
            veiculoAtualizar.setHoraSaida(horaSaida);
            veiculoRepository.save(veiculoAtualizar);
        }
    }
}
