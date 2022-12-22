package com.cg.boot.util;

import java.util.HashSet;


import java.util.Set;

import org.springframework.stereotype.Component;

import com.cg.boot.dto.UserDetails;
import com.cg.boot.entity.User;

@Component
public class AdminUtil {

	public static UserDetails toDetails(User stud) {
		return new UserDetails(stud.getUserId(),stud.getUserName(),stud.getUserPassword(),stud.getUserRole());
	}

}
