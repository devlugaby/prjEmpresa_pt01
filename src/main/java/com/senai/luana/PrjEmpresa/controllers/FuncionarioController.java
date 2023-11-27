package com.senai.luana.PrjEmpresa.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.senai.luana.PrjEmpresa.entities.Funcionario;
import com.senai.luana.PrjEmpresa.services.FuncionarioService;


public class FuncionarioController {
	private final FuncionarioService funcionarioService;

	public FuncionarioController(FuncionarioService funcionarioService) {
		this.funcionarioService = funcionarioService;
	}

	@PostMapping
	public Funcionario createFuncionario(@RequestBody Funcionario funcionario) {
		return funcionarioService.saveFuncionario(funcionario);
	}
	
	@GetMapping
	public ResponseEntity<List<Funcionario>> getAllFuncionario(RequestEntity<Void> requestEntity) {
		String method = requestEntity.getMethod().name();
		String contentType = requestEntity.getHeaders().getContentType().toString();
		List<Funcionario> funcionarios = funcionarioService.getAllFuncionario();
		return ResponseEntity.status(HttpStatus.OK).header("Method", method).header("Content-Type", contentType)
				.body(funcionarios);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Funcionario> getFuncionario(@PathVariable Long funcodigo){
		Funcionario funcionario = funcionarioService.getFuncionarioById(funcodigo);
		if(funcionario != null) {
			return ResponseEntity.ok(funcionario);
		}else {
			return ResponseEntity.notFound().build();
			}
	}

	@PutMapping("/{id}")
	public Funcionario updateFuncionario(@PathVariable Long funcodigo, @RequestBody Funcionario funcionario) {
		return funcionarioService.updateFuncionario(funcodigo, funcionario);
	}

	@DeleteMapping("/{id}")
	public void deleteFuncionario(@PathVariable Long funcodigo) {
		funcionarioService.deleteFuncionario(funcodigo);
	}
	
	
}


