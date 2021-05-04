package com.fullcycle.desafio.docker.pfa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fullcycle.desafio.docker.pfa.model.Modulo;
import com.fullcycle.desafio.docker.pfa.repository.ModuloRepository;

@RestController
@RequestMapping(path = "/modulo")
public class ModuloController {

	@Autowired
	ModuloRepository moduloRepository;
	
	@GetMapping
	public List<Modulo> obterTodos() {
		return moduloRepository.findAll();
		
	}
}
