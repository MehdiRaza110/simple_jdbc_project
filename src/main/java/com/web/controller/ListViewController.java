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

@WebServlet("/listView")
public class ListViewController extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public ListViewController() {
        super();
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//System.out.println(true);
		DAOClass dao2=new DAOClass();
		ResultSet result=dao2.listUser();
		request.setAttribute("res",result);
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/ListUsers.jsp");
		rd.forward(request, response);
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
