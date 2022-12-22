package com.cg.boot.service;

import java.util.Optional;


import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.boot.entity.Question;
//import com.cg.boot.entity.Answer;
import com.cg.boot.dao.TestDao;
import com.cg.boot.dao.UserDao;
import com.cg.boot.dto.TestDetails;
import com.cg.boot.dto.UserDetails;
import com.cg.boot.entity.Test;
import com.cg.boot.entity.User;
import com.cg.boot.util.TestUtil;


@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao uDao;
	@Autowired
	private TestDao testDao;
	@Autowired
	TestService testService;
	@Autowired
	TestUtil testUtil;

	public User assignTest(int userId, int testId) {
		User auser = uDao.findByUserId(userId);
		
		Optional<Test> op = testDao.findById(testId);
		Test atest = op.get();
		atest.setStud_assigned(auser.getUserId());
//		Test btest = op.get();
//	
//			
//		atest.setUser(uDao.save(auser));
//		btest.update(atest);
//		testDao.save(btest);
		
		
		auser.setUserTest(atest);
	return uDao.save(auser) ; 
	}
	
	@Override
	public User addAdmin(User stud) {
		//logger.info("Adding :" +stud);
		User AdminSaved = uDao.save(stud);
		System.out.println(uDao.getClass().getName());
		System.out.println("saved: " + AdminSaved);
		return AdminSaved;
	}

	@Override
	public Test giveTest(int chosenAnswera,int chosenAnswerb, int chosenAnswerc, int chosenAnswerd, int testId) {
		Optional<Test> op = testDao.findById(testId);
		Test updatedTest = op.get();
		Test finall = op.get();
		Set<Question> courseSet = updatedTest.getTestQuestions();
		int sum =1;
		if(courseSet!= null)
		{
			for (Question question : courseSet) {
				if(question.getQuestionAnswer()==chosenAnswera||question.getQuestionAnswer()==chosenAnswerb||question.getQuestionAnswer()==chosenAnswerc
						||question.getQuestionAnswer()==chosenAnswerd)
					{
					System.out.println("entered the question for loop");
					updatedTest.setTestMarksScored(sum);
					
					sum++;
					}
//				updatedTest.setTestTotalMarks(updatedTest.getTestTotalMarks());
			}	
			
		}
//		updatedTest.setTestTotalMarks(updatedTest.getTestMarksScored());
		
		finall.update(updatedTest);
		return testDao.save(updatedTest);
	}

	@Override
	public int getResult(int testId) {
		Optional<Test> op = testDao.findById(testId);
		Test updatedTest = op.get();
		// TODO Auto-generated method stub
		return updatedTest.getTestMarksScored();
	}

	@Override
	public int CalculateTotalMarks(int testId) {
		Optional<Test> op = testDao.findById(testId);
		Test updatedTest = op.get();
		 updatedTest.setTestTotalMarks(updatedTest.getTestMarksScored());
		 return updatedTest.getTestTotalMarks();
	}



}
