package com.senai.luana.PrjEmpresa.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_departamento")
public class Departamento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long depcodigo;
	
	private String name;
	
	//get e set 
	
	public Long getDepcodigo() {
		return depcodigo;
	}
	
	public String getName() {
		return name;
	}
	
	public void setDepcodigo(Long depcodigo) {
		this.depcodigo = depcodigo;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
	

}
