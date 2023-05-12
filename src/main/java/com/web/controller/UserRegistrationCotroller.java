package com.web.controller;
import com.web.model.*;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/userRegistration")
public class UserRegistrationCotroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public UserRegistrationCotroller() {
        super();
     
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/UserRegistration.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String name = request.getParameter("name");
		String city = request.getParameter("city");
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
		DAOClass dao1=new DAOClass();
		dao1.userRegistration(name, city, email, mobile);
		request.setAttribute("msg", "User Registered Succesfully..");
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/UserRegistration.jsp");
		rd.forward(request, response);
		
		
	}

}
