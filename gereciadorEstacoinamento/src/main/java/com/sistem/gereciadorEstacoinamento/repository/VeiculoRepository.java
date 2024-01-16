package com.sistem.gereciadorEstacoinamento.repository;

import com.sistem.gereciadorEstacoinamento.model.Veiculo;
import net.sf.jsqlparser.statement.select.Select;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface VeiculoRepository extends JpaRepository<Veiculo,Integer> {

    @Query("select v from Veiculo v where dataSaida is null or dataSaida = '' ")
    List<Veiculo> findVeiculoEmAberto();
    @Query("select v from Veiculo v where id =?1")
    Veiculo findOneVeiculo(@Param("id") Integer id);
    @Query("select count (*), dataEntrada from Veiculo group By dataEntrada")
    List<String> findRegistroDias();
}
