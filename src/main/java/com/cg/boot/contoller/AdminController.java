package com.cg.boot.contoller;

import java.math.BigInteger;

import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import com.cg.boot.dao.*;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

//import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cg.boot.dto.CreateAdminRequest;
import com.cg.boot.dto.CreateTestRequest;
import com.cg.boot.dto.CreateUserRequest;
import com.cg.boot.dto.TestDetails;
import com.cg.boot.dto.UserDetails;
import com.cg.boot.entity.Question;
import com.cg.boot.entity.QuestionOptions;
import com.cg.boot.entity.Test;
import com.cg.boot.entity.User;
import com.cg.boot.service.QuestionService;
import com.cg.boot.service.TestService;
import com.cg.boot.service.UserRegisterService;
import com.cg.boot.service.UserService;
import com.cg.boot.service.UserServiceImpl;
import com.cg.boot.util.AdminUtil;
import com.cg.boot.util.TestUtil;

@RestController
@RequestMapping("/AdminController")
@Validated
public class AdminController {
	@Autowired
	TestService testService;
	@Autowired
	UserService userService;
	@Autowired
	private UserServiceImpl uService;
	@Autowired
	private UserRegisterService cRegister;
	@Autowired
	private QuestionService questionService;
	@Autowired
	private TestUtil testUtil;
	
	@Autowired
	private AdminUtil adminUtil;

	

	@PutMapping("/updateQuestion")
	public Question updateQuestion(@RequestBody Question question) {
		return questionService.updateQuestion(question);
	}

	@DeleteMapping("/deleteQuestion/{id}")
	public Question deleteQuestion(@PathVariable("id") int id) {
		return questionService.deleteQuestion(id);
	}

	@PutMapping("/assignTest/{userId}/{testId}")
	public User assignTest(@PathVariable int userId, @PathVariable int testId) {
		return uService.assignTest(userId, testId);
	}
	

	@ResponseStatus(HttpStatus.ACCEPTED)
	@PostMapping("/registerUser")
	public UserDetails registerUser(@RequestBody CreateUserRequest requestData, HttpServletRequest request) {
		User ustud = new User(requestData.getUserName(),requestData.getUserPassword(),requestData.getIsAdmin());
		UserDetails uDetails = null;
		if (requestData.getIsAdmin() == true)
			uDetails = new UserDetails(requestData.getUserName(), requestData.getUserPassword(), "Admin",requestData.getIsAdmin());
		else
			uDetails = new UserDetails(requestData.getUserName(), requestData.getUserPassword(), "User",requestData.getIsAdmin());

//		uDetails = cRegister.register(uDetails);
		User us = userService.addAdmin(ustud);
		UserDetails details = adminUtil.toDetails(ustud);
		return details;
	}
	
	@PostMapping("/addtest")
	public TestDetails newTest(@RequestBody CreateTestRequest requestData) {
//	logger.info("test added");
		Test tstud = new Test( requestData.getTestTitle(),requestData.getTestDuration(),requestData.getStartTime(), requestData.getEndTime()); 
		
		Set<Question> courseSet = requestData.getTestQuestions();
		if(courseSet!= null)
		{
			for (Question question : courseSet) {
				tstud.addQuestion(question);
			}
		}
		tstud.setTestTotalMarks(courseSet.size());
		
		Test testSaved = testService.addTest(tstud);
		TestDetails details = testUtil.toDetails(testSaved);
		return details;
	//	return testService.addTest(test);
	}
	
	
	@PostMapping("/addQuestion")
	public Test addQuestion(@RequestBody Question question,int testId) {
		System.out.println(question);
		testService.findById(testId).addQuestion(question);
		return testService.findById(testId);
	}


	@PutMapping("/updatetest")
	public Test updateTest(@RequestBody Test test) {
		return testService.updateTest(test);
	}

	@DeleteMapping("/deletetest/{testId}")
	public Boolean deleteTest(@PathVariable("testId") BigInteger testId) {
		boolean response = testService.deleteTest(testId);
		return response;
	}
	


}
