package com.cg.boot.service;

import java.math.BigInteger;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.boot.dao.QuestionDao;
import com.cg.boot.dao.TestDao;
import com.cg.boot.dto.TestDetails;
import com.cg.boot.entity.Question;
import com.cg.boot.entity.Test;
import com.cg.boot.entity.User;
import com.cg.boot.exception.TestNotFoundException;


@Service
@Transactional
@Component
public class TestService {
	@Autowired
	TestDao testDao;
	@Autowired
	QuestionDao questionDao;

	public Test addTest(Test test) {
		Test testSaved = testDao.save(test);
		System.out.println(testDao.getClass().getName());
		System.out.println("saved"+ testSaved);
		return testSaved;
	}

	public Test updateTest(Test test) {
		Optional<Test> op = testDao.findById(test.getTestId());
		Test updatedTest = op.get();
		updatedTest.update(test);
		return testDao.save(updatedTest);
	}

//	public User assignTest(int userId, int testId) {
//		User auser = uDao.findByUserId(userId);
//		Optional<Test> op = testDao.findById(testId);
//		Test atest = op.get();
//		auser.setUserTest(atest);
//		return uDao.save(auser);
	// adminRepository.deleteById(adminId);
//	}
	
/*
 * @Override
	public boolean deleteAdmin(String adminId) {
		if (!adminRepository.existsById(adminId))
			throw new AdminNotFoundException("Customer with id " + adminId + " Not Found");
		adminRepository.deleteById(adminId);
		return true;
	}
 */
	public Boolean deleteTest(BigInteger testId) {
//		Optional<Test> op = testDao.findById(test.getTestId());
//		
//		Test deleteTest = op.get();
//		testDao.delete(test);
		Integer i = testId.intValue();
		if (!testDao.existsById(i))
			return false;
		
		testDao.deleteById(i);
		return true;

	}

	public Test findById(int testId) {
		Optional<Test> opt = testDao.findById(testId);
		if(!opt.isPresent()) {
			//logger.error("Student not found for id: "+id);
			throw new TestNotFoundException("Student not found for id: "+testId);
		}
		
		return opt.get();
		
	}

	}

