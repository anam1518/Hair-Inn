package com.Dal;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.model.Hair;


public class HairDao {
    
	private Connection connection;
	
	public HairDao(){
		connection = null;
	}
	
	public List<Hair>getAllHair(){
		String sql = "select * from hair";
		ArrayList<Hair> list = new ArrayList<Hair>();
		//String sql = "SELECT* from Hair";
		try{
			Statement st = connection.createStatement();
			 st.execute(sql);
		}
		 catch(SQLException e){e.printStackTrace();
		 }
		return list;
		 }
	public Hair getHairById(){
		return null;
		
	}
	
	public void addHair(Hair hair){
		 String sql = "insert into hair(hairid, haircolor, hairLength, userid) "
	+ "values('"+hair.getHairid()+"',' "+hair.getHaircolor()+" ',' "+hair.getHairlength()+" ',' "+hair.getUserid()+" ;)";
	
	
	try{
		 Statement st = connection.createStatement();
		 st.execute(sql);
	 }
	 catch(SQLException e){e.printStackTrace();
	 }
}
	
	public void deleteHair(int hairid){
		 String sql = "delete from hair where id= "+hairid;
		 
	 }	
	
	public void updateHair(Hair hair){
		  
	  }
	
	
	
	
	
	
	
	
}	
