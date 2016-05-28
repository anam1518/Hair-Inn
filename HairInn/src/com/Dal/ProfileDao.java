package com.Dal;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.model.ProfilePage;



public class ProfileDao {
	private Connection connection;
	
	public ProfileDao(){
		connection = null; //create connection
	}
	
	
	
 
 public void addProfilePage(ProfilePage profilepage){
 String sql = "insert into profilepage(Name,Address,age,height,weight) values('"+profilepage.getName()+"','"+profilepage.getAddress()+" ','"+profilepage.getAge()+"',' "+profilepage.getHeight()+"',' "+profilepage.getWeight()+" ',');";
 try{
	 Statement st = connection.createStatement();
	 st.execute(sql);
 }
 catch(SQLException e){e.printStackTrace();
 }
 }


public void deleteProfilePage(int profilepage){
	 String sql = "delete from profilepage where shapes= "+profilepage;
	 
 }
  public void updateProfilePage(ProfilePage profilepages){
	  
  }
  }

