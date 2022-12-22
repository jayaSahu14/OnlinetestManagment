package com.cg.boot.dto;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.cg.boot.entity.Question;

public class TestDetails {
	
	private Integer testId;
	private String testTitle;
	private double testDuration;
	private Set<QuestionDetails> testQuestions  = new HashSet<>();
	private Date startTime;
	private Date endTime;
	@Override
	public String toString() {
		return "TestDetails [testId=" + testId + ", testTitle=" + testTitle + ", testDuration=" + testDuration
				+ ", testQuestions=" + testQuestions + ", startTime=" + startTime + ", endTime=" + endTime + "]";
	}
	public TestDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TestDetails(int testId, String testTitle, double testDuration, Set<QuestionDetails> testQuestions, Date startTime,
			Date endTime) {
		super();
		this.testId = testId;
		this.testTitle = testTitle;
		this.testDuration = testDuration;
		this.testQuestions = testQuestions;
		this.startTime = startTime;
		this.endTime = endTime;
	}
	
	
	public TestDetails(Integer testId, String testTitle, double testDuration, Set<QuestionDetails> testQuestions,
			Date startTime, Date endTime) {
		super();
		this.testId = testId;
		this.testTitle = testTitle;
		this.testDuration = testDuration;
		this.testQuestions = testQuestions;
		this.startTime = startTime;
		this.endTime = endTime;
	}
	public int getTestId() {
		return testId;
	}
	public void setTestId(int testId) {
		this.testId = testId;
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
	public Set<QuestionDetails> getTestQuestions() {
		return testQuestions;
	}
	public void setTestQuestions(Set<QuestionDetails> testQuestions) {
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
