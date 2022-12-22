package com.cg.boot.dto;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.cg.boot.entity.Test;
import com.fasterxml.jackson.annotation.JsonIgnore;

//@Entity
//@Table(name = "userlogindetails")
public class UserDetails {
	
	@Id
	@GeneratedValue
	private int userId;
	@JsonIgnore
	private Boolean isAdmin;
	
	private String username;
	private String password;
	private String userRole;
	
	

	
	






	public Boolean getIsAdmin() {
		return isAdmin;
	}





	public void setIsAdmin(Boolean isAdmin) {
		this.isAdmin = isAdmin;
	}





	public int getUserId() {
		return userId;
	}


	








	





	public void setUserId(int userId) {
		this.userId = userId;
	}



	
	public UserDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	



	public UserDetails(String username, String password, String userRole) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.userRole = userRole;
	}

	





	public UserDetails(int userId, String username, String password, String userRole) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.userRole = userRole;
	}





	public UserDetails(int userId, Boolean isAdmin, String username, String password, String userRole) {
		super();
		this.userId = userId;
		this.isAdmin = isAdmin;
		this.username = username;
		this.password = password;
		this.userRole = userRole;
	}





	public UserDetails(String userName2, String userPassword, String string, Boolean isAdmin2) {
		// TODO Auto-generated constructor stub
		this.userId = userId;
		this.isAdmin = isAdmin;
		this.username = username;
		this.password = password;
		this.userRole = userRole;
	}





	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	
	@Override
	public String toString() {
		return "UserDetails [username=" + username + ", password=" + password + ", userRole=" + userRole + 
				 "]";
	}

}
