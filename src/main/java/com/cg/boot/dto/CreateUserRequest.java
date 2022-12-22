package com.cg.boot.dto;

public class CreateUserRequest {
	private String UserName;
	private String userPassword;
	private String userRole;
	private Boolean isAdmin;
	@Override
	public String toString() {
		return "CreateUserRequest [UserName=" + UserName + ", userPassword=" + userPassword + ", userRole=" + userRole
				+ ", isAdmin=" + isAdmin + "]";
	}
	public CreateUserRequest(String userName, String userPassword, String userRole) {
		super();
		UserName = userName;
		this.userPassword = userPassword;
		this.userRole = userRole;
	}
	public CreateUserRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getUserName() {
		return UserName;
	}
	
	
	public CreateUserRequest(String userName, String userPassword, String userRole, Boolean isAdmin) {
		super();
		UserName = userName;
		this.userPassword = userPassword;
		this.userRole = userRole;
		this.isAdmin = isAdmin;
	}
	public Boolean getIsAdmin() {
		return isAdmin;
	}
	public void setIsAdmin(Boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	
	

}
