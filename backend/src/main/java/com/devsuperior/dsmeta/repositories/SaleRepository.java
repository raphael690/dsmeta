package com.devsuperior.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmeta.entities.Sale;

//responsável por salvar editar criar buscar vendas no banco de dados etc...
public interface SaleRepository extends JpaRepository<Sale, Long> {

}
