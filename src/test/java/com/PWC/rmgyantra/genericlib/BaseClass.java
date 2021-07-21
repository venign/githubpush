package com.PWC.rmgyantra.genericlib;

import java.sql.SQLException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class BaseClass {
	public DataBaseUtilities dblib=new DataBaseUtilities();
	
	@BeforeSuite
	public void configBS() throws SQLException {
		String baseURL="http://localhost:8084";
				dblib.connectToDB();
	}
	
  @AfterSuite
    public void ConfigAS() throws SQLException {
     dblib.closeDb();
}
}
