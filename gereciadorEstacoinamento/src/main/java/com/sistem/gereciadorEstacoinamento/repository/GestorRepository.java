package com.sistem.gereciadorEstacoinamento.repository;

import com.sistem.gereciadorEstacoinamento.model.Gestor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface GestorRepository extends JpaRepository<Gestor,Integer> {
}
