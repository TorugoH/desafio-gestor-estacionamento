package com.sistem.gereciadorEstacoinamento.repository;

import com.sistem.gereciadorEstacoinamento.model.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

@Component
public interface EmpresaRepository extends JpaRepository<Empresa, Integer  > {
    @Query("Select u from Empresa u where cnpj=?1")
    Empresa findByCnpj(@Param("cnpj")String cnpj);



}
