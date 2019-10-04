package com.lucas.TesteProva;

import java.io.PrintWriter;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns="/hello")
public class PrimeiraServlet extends HttpServlet{

	
	private static final long serialVersionUID = -6957883045906435043L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter(); 
		
		String login = req.getParameter("login");
		String senha = req.getParameter("senha");
		
		Medico medico  = new Medico (login, senha);
		Secretaria secretaria = new Secretaria(login, senha);
		
		out.println("<html><body>");
		
		medico = new MedicoBO().autenticar(medico);
		secretaria = new SecretariaBO().autenticar(secretaria);
		
		if(medico != null) {
			out.println("Medico " + medico.getNome() + " Sucesso</h2>");
			Cookie cookie = new Cookie("Medico.logado", medico.getNome());
			resp.addCookie(cookie);
		}
		
		
		
		
		
		else if(secretaria != null) {
			out.println("Secretaria" + secretaria.getNome() + " Sucesso</h2>");
			Cookie cookie = new Cookie("Secretaria.logado", secretaria.getNome());
			resp.addCookie(cookie);
			
		} else {
			out.println("<h2 style=\"color:red;\"> Errado!</h2>");
		}
		
		
		
		out.println("<a href=\"index.jsp\">Voltar para Home</a>");
		out.println("</body></html>");
		out.flush();
		out.close();
	}
}