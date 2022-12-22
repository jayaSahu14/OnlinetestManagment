package com.cg.boot.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "user_details")
public class User {
	@Id
	@GeneratedValue
	private int userId;
	private String UserName;
	private String userPassword;
	private String userRole;
	
	@Transient
	private Boolean isAdmin;
	
	
//	@OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
	@JsonIgnore
	@OneToOne
	@JoinColumn(name = "user_h1")
	private Test userTest;
	


	public User() {
		super();

	}

	
	public User( String username, String password,Boolean isAdmin) {
		super();
		this.userId = userId;
		
		this.UserName = username;
		this.userPassword = password;
		if(isAdmin==true)
		this.userRole = "Admin";
		else
			this.userRole="User";
	}
	public User(int userId, String userName, String userPassword) {
		super();
		this.userId = userId;
		UserName = userName;
		this.userPassword = userPassword;
	}


	public User(String userName, String userPassword) {
		this.userId = userId;
		UserName = userName;
		this.userPassword = userPassword;
		this.userRole="Admin";
	}


	public User(int userId, String userName, String userPassword, String userRole, Test userTest) {
		super();
		this.userId = userId;
		UserName = userName;
		this.userPassword = userPassword;
		this.userRole = userRole;
		this.userTest = userTest;
	}

	
	

	public User(int userId, String userName, String userPassword, String userRole) {
		super();
		this.userId = userId;
		UserName = userName;
		this.userPassword = userPassword;
		this.userRole = userRole;
		this.userTest = userTest;
	}


	
	
	public User(String userName, String userPassword, String userRole) {
		super();
		UserName = userName;
		this.userPassword = userPassword;
		this.userRole = userRole;
	}
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", UserName=" + UserName + ", userPassword=" + userPassword + ", userRole="
				+ userRole + ", isAdmin=" + isAdmin + "]";
	}


	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return UserName;
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

	public Test getUserTest() {
		return userTest;
	}

	public void setUserTest(Test userTest) {
		this.userTest = userTest;
	}

	public Boolean getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(Boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	public User(int userId, String userName, String userPassword, String userRole, Boolean isAdmin, Test userTest) {
		super();
		this.userId = userId;
		UserName = userName;
		this.userPassword = userPassword;
		this.userRole = userRole;
		this.isAdmin = isAdmin;
		this.userTest = userTest;
	}


	

}