package com.senai.luana.PrjEmpresa.entities;

import java.math.BigDecimal;
import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_funcionario")
public class Funcionario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long funcodigo;
	
	private String funname;
	
	private Date funnascimento;
	
	private BigDecimal funsalario;
	
	//get e set
	
   public Long getFuncodigo() {
	   return funcodigo;
   }
	
	public String getFunname() {
		return funname;
	}
	
	public Date getFunnascimento() {
		return funnascimento;
	}
	
	public BigDecimal getFunsalario() {
		return funsalario;
	}
	
	public void setFuncodigo(Long funcodigo) {
		this.funcodigo = funcodigo;
	}
	
	public void setFunname(String funname) {
		this.funname = funname;
	}
	
	public void setFunnascimento(Date funnascimento) {
		this.funnascimento = funnascimento;
	}
	
	public void setFunsalario(BigDecimal funsalario) {
		this.funsalario = funsalario;
	}
	
	
	
	

}
