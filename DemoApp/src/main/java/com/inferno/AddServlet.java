package com.inferno;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class AddServlet extends HttpServlet {

	// this method name must be service() for servlet to function properly
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int k = i + j;
		
		// k = k*k;
		
		// System.out.println("The result is = " + k);
		 PrintWriter out = res.getWriter();
		 out.println("The result is = " + k);
		
		req.setAttribute("k", k);
//		
//		// Request dispatcher
//		RequestDispatcher rd = req.getRequestDispatcher("sqr");
//		rd.forward(req, res);
		
		// Redirect
		// res.sendRedirect("sqr");
		res.sendRedirect("sqr?k="+k);	// Redirect to the sqr page
	}
}
