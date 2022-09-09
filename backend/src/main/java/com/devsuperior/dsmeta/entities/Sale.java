package com.devsuperior.dsmeta.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity     // framework irá preparar o codigo para o banco ,faz um pre processamente para gerar um codigon executavel
@Table(name = "tb_sales")  // 
public class Sale {
	
	@Id  //  informa que o id será unico
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Será automatico o auto-cremento
	private Long id;
	private String sellerName;
	private Integer visited;
	private Integer deals;
	private Double amount;
	private LocalDate date;
	
	public Sale() {//construtor
	}

	//getters & setters metodos de acessos
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSellrName() {
		return sellrName;
	}

	public void setSellrName(String sellrName) {
		this.sellrName = sellrName;
	}

	public Integer getVisited() {
		return visited;
	}

	public void setVisited(Integer visited) {
		this.visited = visited;
	}

	public Integer getDeals() {
		return deals;
	}

	public void setDeals(Integer deals) {
		this.deals = deals;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}
	
}
	