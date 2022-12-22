package com.cg.boot.dto;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.cg.boot.entity.Question;
import com.cg.boot.entity.User;

public class CreateTestRequest {
	private String testTitle;
	private double testDuration;
	private Set<Question> testQuestions  = new HashSet<>();
	private Date startTime;
	private Date endTime;
	private User user;
	public CreateTestRequest(String testTitle, double testDuration, Set<Question> testQuestions, Date startTime,
			Date endTime, User user) {
		super();
		this.testTitle = testTitle;
		this.testDuration = testDuration;
		this.testQuestions = testQuestions;
		this.startTime = startTime;
		this.endTime = endTime;
		this.user = user;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public CreateTestRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "CreateTestRequest [testTitle=" + testTitle + ", testDuration=" + testDuration + ", testQuestions="
				+ testQuestions + ", startTime=" + startTime + ", endTime=" + endTime + "]";
	}


	
	public String getTestTitle() {
		return testTitle;
	}
	public void setTestTitle(String testTitle) {
		this.testTitle = testTitle;
	}
	public double getTestDuration() {
		return testDuration;
	}
	public void setTestDuration(double testDuration) {
		this.testDuration = testDuration;
	}
	public Set<Question> getTestQuestions() {
		return testQuestions;
	}
	public void setTestQuestions(Set<Question> testQuestions) {
		this.testQuestions = testQuestions;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	
	

}
