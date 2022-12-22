package com.cg.boot.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.stereotype.Repository;

import com.cg.boot.entity.Test;


@Repository
public interface TestDao extends JpaRepository<Test, Integer> {

 

}
