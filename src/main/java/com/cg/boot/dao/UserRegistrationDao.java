package com.cg.boot.dao;

import org.springframework.data.jpa.repository.JpaRepository;




import org.springframework.stereotype.Repository;

import com.cg.boot.entity.User;


//@Repository
public interface UserRegistrationDao
extends JpaRepository<User, String> {

}
