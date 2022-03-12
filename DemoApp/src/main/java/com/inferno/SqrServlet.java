package com.inferno;

import java.io.IOException;
 import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SqrServlet extends HttpServlet {

	// built in doGet() method to receive the redirected connection
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int k = Integer.parseInt(req.getParameter("k"));
		k = k*k;
		
		PrintWriter out = res.getWriter();
		out.println("Result of square of k is = " + k);

		System.out.println("Sqr Is Called !!");
	}
}
