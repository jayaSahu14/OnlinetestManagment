package com.cg.boot.service;


import java.util.List;

//import org.apache.log4j.Logger;

import java.util.Optional;

import javax.transaction.Transactional;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.boot.dao.UserRegistrationDao;
import com.cg.boot.dto.UserDetails;
import com.cg.boot.entity.User;
import com.cg.boot.exception.UserNotFoundException;
@Service
@Transactional
public class UserRegisterServiceImpl implements UserRegisterService {
@Autowired
	private UserRegistrationDao uDao;

@Override
public UserDetails findByName(UserDetails userDetails) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public UserDetails register(UserDetails uDetails) {
	// TODO Auto-generated method stub
	return null;
}

//	//private Logger logger=Logger.getLogger(UserRegisterServiceImpl.class);
//	@Override
//	public UserDetails findByName(User userDetails) {
//		Optional<UserDetails> opt = uDao.findById(userDetails.getUserId());
//		if(!opt.isPresent() ) {
////			logger.error("user with userName :" +userDetails.getUsername()+" not found");
//			throw new UserNotFoundException("user with userName :" +userDetails.getUserId()+" not found" );
//		}
//		UserDetails details =opt.get();
//		if(!details.getPassword().equals(userDetails.getPassword())) {
//			throw new UserNotFoundException( "Invalid Credentials");
//		}
//		return details;
////	}
//	@Override
//	public UserDetails register(UserDetails uDetails) {
//		List<UserDetails> uList = uDao.findAll();
//		for (UserDetails user : uList) {
//			if(user.getUsername().equals(uDetails.getUsername())) {
//				throw new UserNotFoundException( "userName : "+ uDetails.getUsername()+" Already Exsist");
//			}
//		}
//		UserDetails details = uDao.save(uDetails);
//		return details;
//	}
//	@Override
//	public UserDetails findByName(UserDetails userDetails) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
