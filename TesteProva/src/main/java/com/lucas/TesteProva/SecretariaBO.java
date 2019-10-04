package com.lucas.TesteProva;

public class SecretariaBO {


	public Secretaria autenticar(Secretaria u) {
		Secretaria secretaria= new SecretariaDAO().consultarPorLogin(u.getLogin());
		if(secretaria == null) return null;
		if(!secretaria.getSenha().equals(u.getSenha())) return null;
		return secretaria;
	}
	
	public boolean validarSecretaria(Secretaria u) {
		return u.getNome() != null &&
				u.getLogin() != null && 
				u.getSenha() != null;


}
}