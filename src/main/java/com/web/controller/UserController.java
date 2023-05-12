package com.web.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.model.DAOClass;

@WebServlet("/userGet")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public UserController() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		DAOClass dao=new DAOClass();
		boolean checkUser = dao.checkUser(email, password);
		boolean chkEmail=dao.userEmail(email);
		request.setAttribute("chkEmail", chkEmail);
		request.setAttribute("chk", checkUser);
		if(checkUser) {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/UserRegistration.jsp");
			rd.forward(request, response);
			
		}
		else {
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
		}
		
		
	}

}
