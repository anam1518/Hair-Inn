package com.Dal;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;




import com.model.Hair;
import com.model.Hairstyles;

public class HairstylesDao {

	private Connection connection;
	
	public HairstylesDao(){
		connection = null;
	}
	public List<Hairstyles>getAllHaircut(){
		String sql = "select * from hairstyles";
		ArrayList<Hairstyles> list = new ArrayList<Hairstyles>();
		try{
			Statement st = connection.createStatement();
			 st.execute(sql);
		}
		 catch(SQLException e){e.printStackTrace();
		 }
		return list;
		 }
	public Hairstyles getHairById(){
		return null;
		
	}
	public void deleteHairstyles(int hairid){
		 String sql = "delete from hairstyles where id= "+hairid;
		 
	 }	
	public void updateHairstyles(Hairstyles haircut){
		  
	  }
	
}
