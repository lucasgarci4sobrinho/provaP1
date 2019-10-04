package com.lucas.TesteProva;

import java.util.ArrayList;

public class SecretariaDAO {

private static ArrayList<Secretaria> SECRETARIA = new ArrayList<>();
	
	static {
		 SECRETARIA.add(new Secretaria("luc", "garc", "1234"));
	}
	
	public void adicionar(Secretaria u) {
		 SECRETARIA.add(u);
	}
	
	public ArrayList<Secretaria> consultarTodos() {
		return  SECRETARIA ;
	}
	
	public Secretaria consultarPorLogin(String login) {
		for(Secretaria u :  SECRETARIA) {
			if(u.getLogin().equals(login)) {
				return u;
			}
		}
		return null;
	
		
	}
	

}
	