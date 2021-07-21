package com.PWC.rmgyantrapojolib;

public class pojoclass {
	private String createdBy;
	private String projectName;
	private int teamSize;
	private String status;
	
	public pojoclass(String createdBy, String projectName, int teamSize, String status) {
		super();
		this.createdBy = createdBy;
		this.projectName = projectName;
		this.teamSize = teamSize;
		this.status = status;
	}
public pojoclass() {}
public String getCreatedBy() {
	return createdBy;
}
public void setCreatedBy(String createdBy) {
	this.createdBy = createdBy;
}
public String getProjectName() {
	return projectName;
}
public void setProjectName(String projectName) {
	this.projectName = projectName;
}
public int getTeamSize() {
	return teamSize;
}
public void setTeamSize(int teamSize) {
	this.teamSize = teamSize;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}


}
