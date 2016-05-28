	package com.Dal;

import java.sql.*;

public class Dal {

	private static Dal dal;
	private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	private static final String DB_URL = "jdbc:mysql://localhost/hairinn";
	static final String USER = "root";
	static final String PASS = "123456";
	private static Connection conn;
	
	//override default constructor to prevent object creation
	private Dal(){}


	//Singleton access to Database Controller
	public static Dal getDatabaseController(){
		if(dal == null){
			dal = new Dal();
			return dal;
		} else {
			return dal;
		}
	}
	
	
	//return Connection on request
	public Connection getConnection() {
	
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hairinn", "root", "123456");
			return conn;
		} catch (final Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	//close database related objects
	public void close(final Object... objects) {
		try {
			for (Object object : objects) {
				if (object != null && object instanceof ResultSet) {
					final ResultSet result = (ResultSet) object;
					if (!result.isClosed()) {
						result.close();
					}
				} else if (object != null && object instanceof PreparedStatement) {
					final PreparedStatement stmt = (PreparedStatement) object;
					if (!stmt.isClosed()) {
						stmt.close();
					}
				} else if (object != null && object instanceof Connection) {
					final Connection conn = (Connection) object;
					if (!conn.isClosed()) {
						conn.close();
					}
				}
			}
		} catch (final Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return dal;
		
	}


	/**
	 * @return
	 */
	public Dal getDatabase() {
		// TODO Auto-generated method stub
		return  getDatabase();
	}
	
	

}