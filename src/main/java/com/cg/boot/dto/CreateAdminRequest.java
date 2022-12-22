package com.cg.boot.dto;

public class CreateAdminRequest {
	private int adminId;
	private String adminName;
	private String adminPassword;
	@Override
	public String toString() {
		return "CreateAdminRequest [adminId=" + adminId + ", adminName=" + adminName + ", adminPassword="
				+ adminPassword + "]";
	}
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getAdminPassword() {
		return adminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	public CreateAdminRequest(int adminId, String adminName, String adminPassword) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.adminPassword = adminPassword;
	}
	public CreateAdminRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
