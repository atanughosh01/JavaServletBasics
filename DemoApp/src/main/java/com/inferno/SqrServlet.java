package com.inferno;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// @SuppressWarnings("serial")
@WebServlet("/sqr")
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
			if(c.getName().equals("k")) {
				k = Integer.parseInt(c.getValue());
			}
		}
		
		int newK = k*k;
		
		PrintWriter out = res.getWriter();
		out.println("<html><body bgcolor='coral'>");
		out.println("Result of square of k (" + k + ") is = " + newK);
		out.println("<br>(SqrServlet has been called !)");
		out.println("</body></html>");
	}
}
