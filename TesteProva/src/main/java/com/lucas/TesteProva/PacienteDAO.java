package com.lucas.TesteProva;


import java.util.ArrayList;

public class PacienteDAO {

		private static ArrayList<Paciente> PACIENTES = new ArrayList<>();
		
		static {
			PACIENTES.add(new Paciente("luca", "garci", "123"));
		}
		
		public void adicionar(Paciente u) {
			PACIENTES.add(u);
		}
		
		public ArrayList<Paciente> consultarTodos() {
			return PACIENTES;
		}
		
		public Paciente consultarPorLogin(String login) {
			for(Paciente u : PACIENTES) {
				if(u.getLogin().equals(login)) {
					return u;
				}
			}
			return null;
		}
		

	}





