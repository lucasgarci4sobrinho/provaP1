package com.lucas.TesteProva;

public class MedicoBO {


	public Medico autenticar(Medico u) {
		Medico medico = new MedicoDAO().consultarPorLogin(u.getLogin());
		if(medico == null) return null;
		if(!medico.getSenha().equals(u.getSenha())) return null;
		return medico;
	}
	
	public boolean validarMedico(Medico u) {
		return u.getNome() != null &&
				u.getLogin() != null && 
				u.getSenha() != null;


}
}

