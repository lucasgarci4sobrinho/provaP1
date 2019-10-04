package com.lucas.TesteProva;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/logout")
public class LogoutServlet extends HttpServlet {

	
	private static final long serialVersionUID = 6571262753754310818L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie[] cookies = req.getCookies();
		Cookie cookie = null;
		if(cookies != null) {
			for (Cookie c : cookies) {
				if (c.getName().equals("paciente.logado")) {
					cookie = c;
				}
			}
		}
		if (cookie != null) {
			cookie.setMaxAge(0);
			resp.addCookie(cookie);
		}
		resp.sendRedirect("index.html");
	}

}
