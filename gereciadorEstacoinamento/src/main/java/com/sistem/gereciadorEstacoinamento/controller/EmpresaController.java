package com.sistem.gereciadorEstacoinamento.controller;

import com.sistem.gereciadorEstacoinamento.model.Empresa;
import com.sistem.gereciadorEstacoinamento.model.Gestor;
import com.sistem.gereciadorEstacoinamento.model.Veiculo;
import com.sistem.gereciadorEstacoinamento.repository.EmpresaRepository;
import com.sistem.gereciadorEstacoinamento.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empresa")
public class EmpresaController {
    @Autowired
    EmpresaRepository empresaRepository;
    @Autowired
    VeiculoRepository veiculoRepository;
    @GetMapping
    private  List<Empresa> listarEmpresas(){
        return empresaRepository.findAll();
    }
    @DeleteMapping("{id}")
    private void deletarCadastroEmpresa(@PathVariable("id") int id){
        empresaRepository.deleteById(id);
    }
    @PostMapping()
    private  void gesitroEntradaVeiculo(@RequestBody Empresa empresa){
        Empresa empresaExistente = empresaRepository.findByCnpj(empresa.getCnpj());

        if (empresaExistente==null){
            Empresa empresaSalva = empresaRepository.save(empresa);
            salvarVeiculo(empresaSalva,empresa.getVeiculo());
        } else {
            salvarVeiculo(empresaExistente,empresa.getVeiculo());
        }
    }

    private void salvarVeiculo(Empresa empresa, List<Veiculo> veiculo){
       veiculo.forEach(veiculo1 -> veiculo1.setEmpresa(empresa));
        veiculoRepository.saveAll(veiculo);
    }


}
