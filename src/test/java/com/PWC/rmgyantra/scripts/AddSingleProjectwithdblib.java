package com.PWC.rmgyantra.scripts;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import java.sql.SQLException;

import com.PWC.rmgyantra.genericlib.BaseClass;
import com.PWC.rmgyantra.genericlib.JavaUtility;
import com.PWC.rmgyantrapojolib.pojoclass;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class AddSingleProjectwithdblib extends BaseClass{

@Test
public void goingStatus() throws SQLException {
	String projName="WWW02Api"+JavaUtility.getRandomNum();
	pojoclass pObj=new pojoclass("Bharani",projName,10,"Ongoing");
	
	Response resp=given()
			.contentType(ContentType.JSON)
			.body(pObj)
			.post("http://localhost:8084/addProject");
	
	     resp.then().log().all()
	     .contentType(ContentType.JSON)
	     .assertThat().statusCode(201);
	     
	     //capture project Name and status
	     String apiProjectName=resp.jsonPath().get("ProjectName");
	     String apiStatus=resp.jsonPath().get("status");
	     
 //to verify in database
	     
	     String projectName = dblib.executeQueryAndGetData("select * from project",4,apiProjectName);
	     System.out.println(projectName);
	     String projectStatus = dblib.executeQueryAndGetData("select * from project",5,apiStatus);
	     System.out.println(projectStatus);
	    
}
}
