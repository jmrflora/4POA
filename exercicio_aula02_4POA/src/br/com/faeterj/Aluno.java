package br.com.faeterj;

import java.io.Serializable;

public class Aluno implements Serializable{
	private String nome;
	private Integer id;
	
	public Aluno(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}

