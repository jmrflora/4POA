package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/pesquisa")
public class pesquisaGenero extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = req.getSession();
		System.out.println("recebendo pesquisa");
		String nome = req.getParameter("nome");
		String[] valores = req.getParameterValues("opcao");
		String opcoes="";
		for(String aux : valores) {
			opcoes += aux;
		}
		
		session.setAttribute("nome", nome);
		session.setAttribute("opcoes", opcoes);
		System.out.println("opcoes:" + opcoes);
		resp.sendRedirect("resposta.jsp");
	}
}
