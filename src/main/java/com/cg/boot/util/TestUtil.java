package com.cg.boot.util;

import java.util.ArrayList;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Component;

import com.cg.boot.dto.QuestionDetails;
import com.cg.boot.dto.TestDetails;
import com.cg.boot.entity.Question;
import com.cg.boot.entity.Test;




@Component
public class TestUtil {

	public TestDetails toDetails(Test testSaved) {
		Set<QuestionDetails> details = new HashSet<>();
		Set<Question> question= testSaved.getTestQuestions();

		for (Question question2 : question) {
			details.add(new QuestionDetails(question2));
		}
		return new TestDetails(testSaved.getTestId(), testSaved.getTestTitle(), testSaved.getTestDuration(), details, testSaved.getStartTime(), testSaved.getEndTime());
	}

	

}
