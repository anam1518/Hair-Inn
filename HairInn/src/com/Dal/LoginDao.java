package com.Dal;

import java.sql.*;

import com.model.LoginPojo;


/**
 * @author Anam Javed
 
 *
 */
public class LoginDao {
private Connection connection;

	
	public LoginDao(){
		connection = null; //create connection
	}
	
final Dal controller = Dal.getDatabaseController();

 
public LoginPojo verify(final LoginPojo pojo){
	
	Connection conn = null;
	PreparedStatement stmt = null;
	ResultSet result = null;
	
		final LoginPojo loginPojo = new LoginPojo();
		
final String querylogin = "Select* from Login where username =? AND password=?";
  
try {
	stmt = connection.prepareStatement(querylogin);
	stmt.setString(1, loginPojo.getUsername());
	stmt.setString(2, loginPojo.getPassword());
	 result = stmt.executeQuery();
	 while(result.next()){
		 
	 }
	
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
return loginPojo;


  
}








}
