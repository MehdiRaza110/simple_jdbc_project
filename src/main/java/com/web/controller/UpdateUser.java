package com.web.controller;
import com.web.model.*;
import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;





@WebServlet("/updateUser")
public class UpdateUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public UpdateUser() {
        super();
       
    }
  
    HttpSession session;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
		
		request.setAttribute("mobile", mobile);
		
		session=request.getSession();
		session.setAttribute("email", email);
		
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/Update.jsp");
		rd.forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//String name = request.getParameter("name");
		//String city = request.getParameter("city");
		String mobile = request.getParameter("mobile");
		
	
		session=request.getSession();
		String email=(String)session.getAttribute("email");
		//System.out.println(email);
		
		DAOClass dao5=new DAOClass();
		dao5.updateUser(email,mobile);
		ResultSet result=dao5.listUser();
		request.setAttribute("res",result);
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/ListUsers.jsp");
		rd.forward(request, response);
		
	}

}
