package com.lucas.TesteProva;

public class Paciente {

	private String nome;
	private String login;
	private String senha;
	
	public Paciente(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}
	
	public Paciente(String nome, String login, String senha) {
		this.nome = nome;
		this.login = login;
		this.senha = senha;
	}
	
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	

	public String getLogin() {
		return login;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
