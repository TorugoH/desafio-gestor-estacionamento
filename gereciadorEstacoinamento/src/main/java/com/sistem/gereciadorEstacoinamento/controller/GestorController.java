package com.sistem.gereciadorEstacoinamento.controller;

import com.sistem.gereciadorEstacoinamento.model.Empresa;
import com.sistem.gereciadorEstacoinamento.model.Gestor;
import com.sistem.gereciadorEstacoinamento.model.Veiculo;
import com.sistem.gereciadorEstacoinamento.repository.EmpresaRepository;
import com.sistem.gereciadorEstacoinamento.repository.GestorRepository;
import com.sistem.gereciadorEstacoinamento.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GestorController {

    @Autowired
    EmpresaRepository empresaRepository;

    @Autowired
    GestorRepository gestorRepository;



}
