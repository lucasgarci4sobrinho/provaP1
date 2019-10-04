package com.lucas.TesteProva;

import java.util.ArrayList;

public class MedicoDAO {

	private static ArrayList<Medico> MEDICOS = new ArrayList<>();
	
	static {
		MEDICOS.add(new Medico("lucas", "garcia", "12345"));
	}
	
	public void adicionar(Medico u) {
		MEDICOS.add(u);
	}
	
	public ArrayList<Medico> consultarTodos() {
		return MEDICOS ;
	}
	
	public Medico consultarPorLogin(String login) {
		for(Medico u : MEDICOS) {
			if(u.getLogin().equals(login)) {
				return u;
			}
		}
		return null;
	}
	

}
	
	
