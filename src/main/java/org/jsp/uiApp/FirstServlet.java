package org.jsp.uiApp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException
	{
		// Fetch UI/Form Data
		String name = req.getParameter("nm");
		String place = req.getParameter("pl");
		
		//presentation logic
		PrintWriter out = resp.getWriter();
		out.println("<html><body bgcolor='yellow'>"+"<h1>Student name is "+name+" from "+place+"</h1>"+"</body></html>");
		out.close();
	}

}
