package com.lucas.TesteProva;

public class PacienteBO {

	public Paciente autenticar(Paciente u) {
		Paciente paciente = new PacienteDAO().consultarPorLogin(u.getLogin());
		if(paciente == null) return null;
		if(!paciente.getSenha().equals(u.getSenha())) return null;
		return paciente;
	}
	
	public boolean validarPaciente(Paciente u) {
		return u.getNome() != null &&
				u.getLogin() != null && 
				u.getSenha() != null;


}
}
