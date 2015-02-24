package com.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginHandler
 */
public class LoginHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoginHandler()
    {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		if(request.getParameter("username").equals("shahid")&&request.getParameter("password").equals("12345"))
		{
			
		
		
			response.sendRedirect("welcome.jsp");
			
			
		}
			else
			{	response.sendRedirect("Invalid.jsp");
				
		}
	}

}
