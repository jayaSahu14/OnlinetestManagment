package com.cg.boot.service;

import com.cg.boot.entity.Question;

public interface QuestionService {

	public Question addQuestion(Question question);

	public Question updateQuestion(Question question);

	public Question deleteQuestion(int id);

}
