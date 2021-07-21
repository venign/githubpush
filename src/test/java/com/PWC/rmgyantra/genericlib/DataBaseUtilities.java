package com.PWC.rmgyantra.genericlib;


import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class DataBaseUtilities {
	public static Connection con;
	public static Driver driverRef;
	public ResultSet result;
	


	public void connectToDB() throws SQLException {
  Driver driverRef=new Driver();
  DriverManager.registerDriver(driverRef);
   con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projects","root","root");
	}
	
	public ResultSet executeQuery(String query) throws SQLException {
	return result=con.createStatement().executeQuery(query);
	}
	
	public String executeQueryAndGetData(String query,int columnNAme,String expectedData) throws SQLException {
		result=con.createStatement().executeQuery(query);
	while(result.next()) {
		if(result.getString(columnNAme).equals(expectedData)) {
			break;
		}
		
		
	}
	return expectedData;

	
	}

	public void closeDb() throws SQLException {
		con.close();
		
	}
	
}














