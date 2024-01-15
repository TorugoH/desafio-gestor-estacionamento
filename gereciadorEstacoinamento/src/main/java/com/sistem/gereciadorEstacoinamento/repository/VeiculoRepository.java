package com.sistem.gereciadorEstacoinamento.repository;

import com.sistem.gereciadorEstacoinamento.model.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface VeiculoRepository extends JpaRepository<Veiculo,Integer> {
}
