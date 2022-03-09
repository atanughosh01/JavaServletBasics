package com.inferno;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@SuppressWarnings("serial")
public class AddServlet extends HttpServlet {
	
	// this method name must be service() for servlet to function properly
	public void service(HttpServletRequest req, HttpServletResponse res) {
		
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("numj"));
		int k = i + j;
		System.out.println("The result is = " + k);
	}
}
