package com.cg.boot.dto;


	import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.cg.boot.entity.Question;
import com.cg.boot.entity.QuestionOptions;

public class QuestionDetails {
	
	private int questionId;
	private QuestionOptions questionOptions;
	private String questionTitle;
	private Integer questionAnswer;
	private int chosenAnswer;
	public QuestionDetails() {
		super();
		// TODO Auto-generated constructor stub
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
	public int getChosenAnswer() {
		return chosenAnswer;
	}
	public void setChosenAnswer(int chosenAnswer) {
		this.chosenAnswer = chosenAnswer;
	}
	public QuestionDetails(int questionId, QuestionOptions questionOptions, String questionTitle,
			Integer questionAnswer, int chosenAnswer) {
		this.questionId = questionId;
		this.questionOptions = questionOptions;
		this.questionTitle = questionTitle;
		this.questionAnswer = questionAnswer;
		this.chosenAnswer = chosenAnswer;
	}
	
	public QuestionDetails(Question question2) {
		this.questionId =question2.getQuestionId(); 
		this.questionOptions = question2.getQuestionOptions();
		this.questionTitle = question2.getQuestionTitle();
		this.questionAnswer = question2.getQuestionAnswer();
		this.chosenAnswer = question2.getChosenAnswer();
		
	}

	 
}
