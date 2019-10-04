package com.lucas.TesteProva;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/usuario")
public class UserServlet extends HttpServlet{
	private static final long serialVersionUID = 1l;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		
		String login = req.getParameter("login");
		String senha = req.getParameter("senha");
		String nome = req.getParameter("nome");
		
		Medico medico = new Medico( nome, login,senha);
		Secretaria secretaria = new Secretaria(nome , login,senha);
		out.println("<html><body>");
		
		if(new MedicoBO().validarMedico(medico)) {
			new MedicoDAO().adicionar(medico);
			out.println("<h2>Medico " + medico.getNome() + " criado com sucesso.</h2>");
			
		} else {
			out.println("<h2 style=\"color:red;\"> Necessario preencher todos os campos</h2>");
		}
		
		if(new SecretariaBO().validarSecretaria(secretaria)) {
			new SecretariaDAO().adicionar(secretaria);
			out.println("<h2>secretaria " + secretaria.getNome() + " criado com sucesso.</h2>");
			
		} else {
			out.println("<h2 style=\"color:red;\"> Necessario preencher todos os campos</h2>");
		}
		
		
		
		
		
		
		out.println("<a href=\"index.jsp\">Voltar para Home</a>");
		out.println("</body></html>");
		out.flush();
		out.close();
		
	}
}
