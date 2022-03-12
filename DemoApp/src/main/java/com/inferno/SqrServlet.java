package com.inferno;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class SqrServlet extends HttpServlet {

	// built in doGet() method to receive the redirected connection
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		// int k = Integer.parseInt(req.getParameter("k"));
		
		// HttpSession session = req.getSession();
		// int k = (int) session.getAttribute("k");
		// session.removeAttribute("k");
		
		int k = 0;
		Cookie cookies[] = req.getCookies();
		
		for (Cookie c : cookies) {
			if(c.getName().equals("k"))
				k = Integer.parseInt(c.getValue());
		}
		
		k = k*k;
		
		PrintWriter out = res.getWriter();
		out.println("Result of square of k is = " + k);
		out.println("Sqr Is Called !!");
	}
}
