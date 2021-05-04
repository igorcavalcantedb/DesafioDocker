package com.fullcycle.desafio.docker.pfa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Modulo {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;
	public String nome;
	public int quantidadeAulas;
	
	public Modulo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Modulo(String nome, int quantidadeAulas) {
		super();
		this.nome = nome;
		this.quantidadeAulas = quantidadeAulas;
	}

	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQuantidadeAulas() {
		return quantidadeAulas;
	}
	public void setQuantidadeAulas(int quantidadeAulas) {
		this.quantidadeAulas = quantidadeAulas;
	}
	
	

}
