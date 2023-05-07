package app;

import java.io.Serializable;

public class Aluno implements Serializable{
	private String nome;
	private String matricula;
	private String email;

	public Aluno(String nome, String matricula, String email){
		this.nome = nome;
		this.matricula = matricula;
		this.email = email;
	}

	public String getNome(){
		return nome;
	}

	public void setNome(String novoNome){
		this.nome = novoNome;
	}
}
