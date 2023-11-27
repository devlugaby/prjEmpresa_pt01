package com.senai.luana.PrjEmpresa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.luana.PrjEmpresa.entities.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

}
