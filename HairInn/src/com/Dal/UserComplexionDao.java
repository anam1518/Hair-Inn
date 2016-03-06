package com.Dal;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.model.UserComplexion;



public class UserComplexionDao<FaceShapes> {
	private Connection connection;
	
	public UserComplexionDao(){
		connection = null; //create connection
	}
	
	public List<UserComplexion>getAlltypes(){
		String sql = "select* from usercomplexion";
		ArrayList<UserComplexion> list = new ArrayList<UserComplexion>();
		
		
		 try{
			 Statement st = connection.createStatement();
			 st.execute(sql);
		 }
		 catch(SQLException e){e.printStackTrace();
		 }
		return list;
		 }
	
	
	
	
 public UserComplexion getTypes(){
	return null;
	 
	
}
 
 public void addUserComplexion(UserComplexion usercomplexion){
 String sql = "insert into usercomplexion(types, userid) values('"+usercomplexion.getTypes()+"','"+usercomplexion.getUserid()+" ',');";
 try{
	 Statement st = connection.createStatement();
	 st.execute(sql);
 }
 catch(SQLException e){e.printStackTrace();
 }
 }


public void deleteTypes(int types){
	 String sql = "delete from usercomplaxion where types= "+types;
	 
 }
  public void updateUserComplexion(UserComplexion usercomplexion){
	  
  }
  }

