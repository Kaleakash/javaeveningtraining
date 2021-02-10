package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Demo
 */
@WebServlet("/Abc")
public class Demo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Demo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("welcome servlet");
		PrintWriter pw = response.getWriter();
		String user = request.getParameter("user");
		String pass = request.getParameter("pass");
		RequestDispatcher rd1 = request.getRequestDispatcher("Home");
		RequestDispatcher rd2 = request.getRequestDispatcher("login.html");
		if(user.equals("Raj") && pass.equals("123")) {
				pw.println("Successfully Login");
				//rd1.forward(request, response);			// forward output only target page.	old request  navigate within same application 
				response.sendRedirect("Home");			// sendRedirect output target page 	new request navigate output side application.  
		}else {
			pw.println("Invalid UserName and password");			// source page + target page = one page output 
			rd2.include(request, response);
		}
		//pw.println("Welcome to SErvlet Application...");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
