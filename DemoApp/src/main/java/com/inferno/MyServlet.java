package com.inferno;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// @SuppressWarnings("serial")
@WebServlet("/home")
public class MyServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		PrintWriter out = res.getWriter();
		out.print("Hi ");
		
		// ServletContext
		ServletContext ctx = getServletContext();
		String str = ctx.getInitParameter("name");
		out.println(str + " !!");
		
		str = ctx.getInitParameter("phone");
		out.println("You use a " + str + " phone.");
		
		
		// ServletConfig
		ServletConfig cfg = getServletConfig();
		String newStr = cfg.getInitParameter("name");
		out.println("\nHello " + newStr + " !!");
	}
}
