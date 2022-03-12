package com.inferno;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
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
		
		//	PrintWriter out = res.getWriter();
		//	out.println("The result is = " + k);
		//	req.setAttribute("k", k);
		
		// Request dispatcher
		// RequestDispatcher rd = req.getRequestDispatcher("sqr");
		// rd.forward(req, res);
		
		// Session data can be stored by using HttpSession or Cookie
		// HttpSession session = req.getSession();
		// session.setAttribute("k", k);
		
		Cookie cookie = new Cookie("k", k+"");
		res.addCookie(cookie);
		
		// Redirect
		// res.sendRedirect("sqr");
		res.sendRedirect("sqr?k="+k);	// Redirect to the sqr page
	}
}
