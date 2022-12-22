package com.cg.boot.service;

import com.cg.boot.dto.UserDetails;
import com.cg.boot.entity.User;

public interface UserRegisterService {

	UserDetails findByName(UserDetails userDetails);

	UserDetails register(UserDetails uDetails);

}
