package com.jspiders.servlet.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SkillsServlet")
public class SkillsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		String Firstname = request.getParameter("Firstname");
		String Lastname = request.getParameter("Lastname");
		String[] skills = request.getParameterValues("skills");
		writer.println("<h1>Hello" + Firstname + " " + Lastname + "/h1");
		writer .println("<h3>"+ skills+"</h3>");
	}

}
