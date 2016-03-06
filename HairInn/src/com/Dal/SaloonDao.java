

package com.Dal;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.model.Saloon;
import com.model.User;



public class SaloonDao {
	private Connection connection;
	
	public SaloonDao(){
		connection = null; //create connection
	}
	
	public List<Saloon>getAllSaloon(){
		String sql = "select* from saloon";
		ArrayList<Saloon> list = new ArrayList<Saloon>();
		
		
		 try{
			 Statement st = connection.createStatement();
			 st.execute(sql);
		 }
		 catch(SQLException e){e.printStackTrace();
		 }
		return list;
		 }
	
	 public void getSaloonById(){
		 return;
	
	 }
 
	 public void addSaloon(Saloon saloon){
		 String sql = "insert into saloon(saloonid,Name, email,ContactNo,Address) values('"+saloon.getSaloonid()+"','"+saloon.getName()+" ',' "+saloon.getEmail()+" ',' "+saloon.getContactNo()+" ',' "+saloon.getAddress()+" );";
		 try{
			 Statement st = connection.createStatement();
			 st.execute(sql);
		 }
		 catch(SQLException e){e.printStackTrace();
		 }
		 }
	 
	 
	 
	 
	 
	 


public void deleteSaloon(int saloonid){
	 String sql = "delete from saloon where id= "+saloonid;
	 
 }
  public void updateSaloon(Saloon saloon){
	  
  }
  }


