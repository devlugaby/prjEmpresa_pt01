package com.senai.luana.PrjEmpresa.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.senai.luana.PrjEmpresa.entities.Departamento;
import com.senai.luana.PrjEmpresa.repositories.DepartamentoRepository;

@Service
public class DepartamentoService {
	private final DepartamentoRepository departamentoRepository;
	
	public DepartamentoService(DepartamentoRepository departamentoRepository) {
		this.departamentoRepository = departamentoRepository;
	}

	public Departamento saveDepartamento(Departamento departamento) {
		return departamentoRepository.save(departamento);
	}

	public Departamento getDepartamentoById(Long depcodigo) {
		return departamentoRepository.findById(depcodigo).orElse(null);
	}

	public List<Departamento> getAllDepartamento() {
		return departamentoRepository.findAll();
	}

	public void deleteDepartamento(Long depcodigo) {
	  departamentoRepository.deleteById(depcodigo);
	}
	
		public Departamento updateDepartamento(Long depcodigo, Departamento novoDepartamento) {
			Optional<Departamento> departamentoOptional = departamentoRepository.findById(depcodigo);
			if (departamentoOptional.isPresent()) {
				Departamento departamentoExistente = departamentoOptional.get();
				departamentoExistente.setName(novoDepartamento.getName());
				departamentoExistente.setDepcodigo(novoDepartamento.getDepcodigo());
				return departamentoRepository.save(departamentoExistente);
			} else {
				return null;
			}
		}


}
