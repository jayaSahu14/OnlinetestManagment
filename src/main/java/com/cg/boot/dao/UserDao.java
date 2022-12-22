package com.cg.boot.dao;

import org.springframework.data.jpa.repository.JpaRepository;



import org.springframework.stereotype.Repository;

//import com.cg.boot.entity.Answer;
import com.cg.boot.entity.User;


@Repository
public interface UserDao extends JpaRepository<User, Integer> {
	User findByUserId(int id);

	//Answer save(Answer answer);

}
