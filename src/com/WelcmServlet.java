package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WelcmServlet
 */
@WebServlet("/WelcmServlet")
public class WelcmServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WelcmServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	    
			String firstName = request.getParameter("firstname");
	    	String lastName = request.getParameter("lastname");
	    	
	    	System.out.println("First Name is " + firstName);
	    	System.out.println("Last Name is " + lastName);
	    	request.getSession().setAttribute("ofname", firstName);
	    	request.getSession().setAttribute("olname", lastName);
	    	
	        response.setContentType("text/html");
			response.sendRedirect("jsp/display.jsp");
	}


	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}

