package com.sistem.gereciadorEstacoinamento.controller;

import com.sistem.gereciadorEstacoinamento.model.Veiculo;
import com.sistem.gereciadorEstacoinamento.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/veiculo")
public class VeiculoController {
    @Autowired
    VeiculoRepository veiculoRepository;

    @GetMapping
    private void listarEmpresas(){
        veiculoRepository.findAll();
    }
    @PostMapping
    private void cadastrarVeiculo (@RequestBody Veiculo veiculo){
        veiculoRepository.save(veiculo);
    }
    @DeleteMapping("{id}")
    private void apagarVeiculo(@PathVariable("id") int id){
        veiculoRepository.deleteById(id);
    }
}
