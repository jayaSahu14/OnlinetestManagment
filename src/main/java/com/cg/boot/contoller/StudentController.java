package com.cg.boot.contoller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.boot.dto.TestDetails;
//import com.cg.boot.entity.Answer;
import com.cg.boot.entity.Test;
import com.cg.boot.entity.User;
import com.cg.boot.service.UserService;

@RestController
@RequestMapping("/StudentController")
@CrossOrigin("*")
public class StudentController 
{
	@Autowired
	UserService userService;
	
	@PutMapping("/giveTest/{chosenAnswera}/{chosenAnswerb}/{chosenAnswerc}/{chosenAnswerd}/{testId}")
	public Test assignTest(@PathVariable("chosenAnswera") int chosenAnswera, @PathVariable("chosenAnswerb") int chosenAnswerb,@PathVariable("chosenAnswerc") int chosenAnswerc,@PathVariable("chosenAnswerd") int chosenAnswerd,@PathVariable("testId") int testId) {
		return userService.giveTest(chosenAnswera,chosenAnswerb,chosenAnswerc,chosenAnswerd,testId);
	}
	
	@GetMapping("/getResult/{testId}")
	public int getResult( @PathVariable("testId") int testId){
		return userService.getResult(testId);
	}
	
	@PutMapping("/calculateTotalMarks/{testId}")
	public int calculateTotalMarks(@PathVariable("testId") int testId) {
		return userService.CalculateTotalMarks(testId);
	}
	
}
