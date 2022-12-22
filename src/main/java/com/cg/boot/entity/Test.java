package com.cg.boot.entity;

import java.math.BigDecimal;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "test")
public class Test {
	@Id
	@GeneratedValue
	private int testId;
	private String testTitle;
	@Column(name = "duration_test")
	private double testDuration;
	
	@OneToMany(mappedBy = "test", cascade = CascadeType.ALL)
	private Set<Question> testQuestions  = new HashSet<>();
	
	@Column(name = "Start_time")
	@Temporal(TemporalType.TIMESTAMP)
	private Date startTime;
	
	@Column(name = "end_Time")
	@Temporal(TemporalType.TIMESTAMP)
	private Date endTime;
	
	@JsonIgnore
	@OneToOne(mappedBy = "userTest", cascade = CascadeType.ALL)
	private User user;
	
	
	@Column(name = "stud_assigned")
	private int stud_assigned;

	
	
	
	public int getStud_assigned() {
		return stud_assigned;
	}

	public void setStud_assigned(int stud_assigned) {
		this.stud_assigned = stud_assigned;
	}

	private int testTotalMarks;
	private int testMarksScored;
	
	

	public Test(int testId, String testTitle, double testDuration, Set<Question> testQuestions, Date startTime,
			Date endTime, User user, int testTotalMarks, int testMarksScored) {
		super();
		this.testId = testId;
		this.testTitle = testTitle;
		this.testDuration = testDuration;
		this.testQuestions = testQuestions;
		this.startTime = startTime;
		this.endTime = endTime;
		this.user = user;
		this.testTotalMarks = testTotalMarks;
		this.testMarksScored = testMarksScored;
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
	

	public int getTestTotalMarks() {
		return testTotalMarks;
	}

	public void setTestTotalMarks(int testTotalMarks) {
		this.testTotalMarks = testTotalMarks;
	}

	public int getTestMarksScored() {
		return testMarksScored;
	}

	public void setTestMarksScored(int testMarksScored) {
		this.testMarksScored = testMarksScored;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}



	@Override
	public String toString() {
		return "Test [testId=" + testId + ", testTitle=" + testTitle + ", testDuration=" + testDuration
				+ ", testQuestions=" + testQuestions + ", startTime=" + startTime + ", endTime=" + endTime + ", user="
				+ user + "]";
	}

	public Test(int testId, String testTitle, double testDuration, Set<Question> testQuestions, Date startTime,
			Date endTime) {
		super();
		this.testId = testId;
		this.testTitle = testTitle;
		this.testDuration = testDuration;
		this.testQuestions = testQuestions;
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public Test() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void update(Test test) {
		this.testTitle = test.getTestTitle();
		this.testDuration = test.getTestDuration();
		this.testQuestions = test.getTestQuestions();
		this.startTime = test.getStartTime();
		this.endTime = test.getEndTime();

	}
	

	public Test(String testTitle, double testDuration, Set<Question> testQuestions, Date startTime, Date endTime) {
		super();
		this.testTitle = testTitle;
		this.testDuration = testDuration;
		this.testQuestions = testQuestions;
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public Test(String testTitle, double testDuration, Date startTime, Date endTime) {
		this.testTitle = testTitle;
		this.testDuration = testDuration;
		this.startTime = startTime;
		this.endTime = endTime;
		this.testMarksScored = testMarksScored;
	}

	public void addQuestion(Question question) {
		question.setTest(this);
		testQuestions.add(question);

	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
	

}
