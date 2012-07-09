package com.ragib.test;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Feedback extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Thank You :)");
	}
}
