package com.Dal;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.model.User;



public class UserDao {
	private Connection connection;
	
	public UserDao(){
		connection = null; //create connection
	}
	
	public List<User>getAllUser(){
		//String sql = "select* from user";
		ArrayList<User> list = new ArrayList<User>();
		
		String sql = "SELECT * from user ";
		 try{
			 Statement st = connection.createStatement();
			 st.execute(sql);
		 }
		 catch(SQLException e){e.printStackTrace();
		 }
		return list;
		 }
	
	
	
	
 public User getUserById(){
	 return null;
	
}
 
 public void addUser(User user){
 
	 
	 String sql = "insert into user(userid, firstName, lastName, email,password, height, weight, age) values('"+user.getFirstName()+"','"+user.getLastName()+" ',' "+user.getEmail()+" ',' "+user.getPassword()+" ',' "+user.getHeight()+" ',' "+user.getWeight()+" ',' "+user.getAge()+" ',');";
 
	 try{
	 System.out.println(sql);
	 Statement st = connection.createStatement();
	 st.execute(sql);
 }
 catch(SQLException e){e.printStackTrace();
 }
 }


public void deleteUser(int userid){
	 String sql = "delete from users where id= "+userid;
	 
 }
  public void updateUser(User user){
	  
  }
  public void verifyLogin(User user){
	  String sql = "Select* where email ="  +user.getEmail()+ "and password=" +user.getPassword() ;
	  try{
		  Statement st = connection.createStatement();
		  st.execute(sql);
	  }
	  catch(SQLException e){e.printStackTrace();
  }
  }
}