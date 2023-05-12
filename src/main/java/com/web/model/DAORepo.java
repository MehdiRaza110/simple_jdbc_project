package com.web.model;

import java.sql.ResultSet;

public interface DAORepo {
	
	public boolean checkUser(String email,String password);
	public boolean userEmail(String email);
	public void connectDB();
	public void closeDB();
	public void userRegistration(String name, String city, String email, String mobile);
	public ResultSet listUser();
	public void deleteUser(String email);
	public void updateUser(String email,String mobile);
	;
	
	
}
