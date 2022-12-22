package com.cg.boot.service;

import com.cg.boot.dto.TestDetails;

//import com.cg.boot.entity.Answer;

import com.cg.boot.entity.Test;
import com.cg.boot.entity.User;

public interface UserService {
	public User assignTest(int userId, int testId);

	User addAdmin(User stud);



	public int getResult(int testId);

	public Test giveTest(int chosenAnswera, int chosenAnswerb, int chosenAnswerc, int chosenAnswerd, int testId);

	public int CalculateTotalMarks(int testId);

	//public Answer addAnswer(Answer answer);

}
