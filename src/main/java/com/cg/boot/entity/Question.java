package com.cg.boot.entity;




import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import com.cg.boot.entity.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name ="question")
public class Question {
	@Id
	@GeneratedValue
	private int questionId;
	@OneToOne(mappedBy = "question", cascade = CascadeType.ALL, targetEntity=QuestionOptions.class)
	@JoinColumn(name = "question_options")
	private QuestionOptions questionOptions;
//	private String[] questionoptionfinal= new String[4];
	private String questionTitle;
	private Integer questionAnswer;
	private int chosenAnswer;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name ="testId")
	private Test test ;	
	
	

	
	
	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", questionOptions=" + questionOptions + ", questionTitle="
				+ questionTitle + ", questionAnswer=" + questionAnswer + ", chosenAnswer=" + chosenAnswer + "]";
	}


	public Question(int questionId, QuestionOptions questionOptions, String questionTitle, Integer questionAnswer,
			int chosenAnswer, Test test) {
		super();
		this.questionId = questionId;
		this.questionOptions = questionOptions;
		this.questionTitle = questionTitle;
		this.questionAnswer = questionAnswer;
		this.chosenAnswer = chosenAnswer;
		this.test = test;
	}


	public Question(int questionId,int chosenAnswer, QuestionOptions questionOptions, String questionTitle, Integer questionAnswer, Test test) 
	{
		super();
		this.questionId = questionId;
		this.questionOptions = questionOptions;
		this.questionTitle = questionTitle;
		this.questionAnswer = questionAnswer;
	   this.chosenAnswer = chosenAnswer;
		this.test = test;
	}
	

	





	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getChosenAnswer() {
		return chosenAnswer;
	}

	public void setChosenAnswer(int chosenAnswer) {
		this.chosenAnswer = chosenAnswer;
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public QuestionOptions getQuestionOptions() {
		return questionOptions;
	}

	public void setQuestionOptions(QuestionOptions questionOptions) {
		this.questionOptions = questionOptions;
	}

	public String getQuestionTitle() {
		return questionTitle;
	}

	public void setQuestionTitle(String questionTitle) {
		this.questionTitle = questionTitle;
	}

	public Integer getQuestionAnswer() {
		return questionAnswer;
	}

	public void setQuestionAnswer(Integer questionAnswer) {
		this.questionAnswer = questionAnswer;
	}

	

	public Test getTest() {
		return test;
	}

	public void setTest(Test test) {
		this.test = test;
	}
	
//	public void addQuestionOption(QuestionOptions questionOption1) {
//		questionOption1.setQuestion(this);
//		questionOptions.add(questionOption1);
//	}

}