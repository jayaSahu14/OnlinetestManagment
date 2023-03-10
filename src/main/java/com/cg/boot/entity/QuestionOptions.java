package com.cg.boot.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.Fetch;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class QuestionOptions {
	@Id
	@GeneratedValue
	private int questionoptionId;
	private String option1;
	private String option2;
	private String option3;
	private String option4;
	@JsonIgnore
	@OneToOne
	@JoinColumn(name ="questionId")
	private Question question;

	public QuestionOptions() {
		super();

	}

	

	@Override
	public String toString() {
		return "QuestionOptions [questionoptionId=" + questionoptionId + ", option1=" + option1 + ", option2=" + option2
				+ ", option3=" + option3 + ", option4=" + option4 + ", question=" + question + "]";
	}



	public QuestionOptions(String option1, String option2, String option3, String option4, Question question) {
		super();
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
		this.question = question;
	}

	public String getOption1() {
		return option1;
	}

	public void setOption1(String option1) {
		this.option1 = option1;
	}

	public String getOption2() {
		return option2;
	}

	public void setOption2(String option2) {
		this.option2 = option2;
	}

	public String getOption3() {
		return option3;
	}

	public void setOption3(String option3) {
		this.option3 = option3;
	}

	public String getOption4() {
		return option4;
	}

	public void setOption4(String option4) {
		this.option4 = option4;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

}
