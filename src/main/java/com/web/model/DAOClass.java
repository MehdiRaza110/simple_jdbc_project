package com.web.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DAOClass implements DAORepo {
	
	private Connection con;
	private Statement stmnt;

	@Override
	public boolean checkUser(String email, String password) {
		
		connectDB();
		try {	
			ResultSet res = stmnt.executeQuery("SELECT * FROM registration where email='"+email+"' AND password='"+password+"'");
				if(res.next()) {
					return true;
				}
			} catch (Exception e) {
			e.printStackTrace();
				}
        	return false;
		


	}

	@Override
	public void connectDB() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","test");
			stmnt = con.createStatement();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void closeDB() {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void userRegistration(String name, String city, String email, String mobile) {
		//System.out.println(true);
		connectDB();
		try {
			stmnt.executeUpdate("insert into userRegistration values('"+name+"','"+city+"','"+email+"','"+mobile+"')");
		} catch (Exception e) {
			e.printStackTrace();
		}
		closeDB();
	}

	@Override
	public ResultSet listUser() {
		try {	
			connectDB();
			ResultSet res = stmnt.executeQuery("SELECT * FROM userRegistration");
				if(res.next()) {
					return res;
				}
			} catch (Exception e) {
			e.printStackTrace();
				}
		
		return null;
	}

	@Override
	public boolean userEmail(String email) {
		
		connectDB();
		try {	
			ResultSet chkMail =stmnt.executeQuery("SELECT * FROM registration where email='"+email+"'");
				if(chkMail.next()) {
					return true;
				}
			} catch (Exception e) {
			e.printStackTrace();
				}
        	return false;
	}

	@Override
	public void deleteUser(String email) {
		
		connectDB();
		try {
			stmnt.executeUpdate("DELETE FROM userRegistration where email='"+email+"'");
			
		} catch (Exception e) {
			
		}
		
	}

	@Override
	public void updateUser(String email, String mobile) {
		
		connectDB();
		try {
			stmnt.executeUpdate("UPDATE userRegistration SET mobile=('"+mobile+"') where email=('"+email+"')");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		closeDB();
	}

}
