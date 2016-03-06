package com.Dal;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.model.FaceShapes;



public class FaceShapesDao {
	private Connection connection;
	
	public FaceShapesDao(){
		connection = null; //create connection
	}
	
	public List<FaceShapes>getAllShapes(){
		String sql = "select* from faceshapes";
		ArrayList<FaceShapes> list = new ArrayList<FaceShapes>();
		
		
		 try{
			 Statement st = connection.createStatement();
			 st.execute(sql);
		 }
		 catch(SQLException e){e.printStackTrace();
		 }
		return list;
		 }
	
	
	
	
 public FaceShapes getShapes(){
	 return null;
	
}
 
 public void addFaceShapes(FaceShapes faceshapes){
 String sql = "insert into faceshapes(shapes, userid) values('"+faceshapes.getShapes()+"','"+faceshapes.getUserid()+" ',');";
 try{
	 Statement st = connection.createStatement();
	 st.execute(sql);
 }
 catch(SQLException e){e.printStackTrace();
 }
 }


public void deleteFaceShapes(int shapes){
	 String sql = "delete from faceshapes where shapes= "+shapes;
	 
 }
  public void updateFaceShapes(FaceShapes faceshapes){
	  
  }
  }

