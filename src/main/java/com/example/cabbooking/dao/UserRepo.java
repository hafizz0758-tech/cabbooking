package com.example.cabbooking.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cabbooking.model.User;

public interface UserRepo extends JpaRepository<User,Integer >{

	User findByEmail(String email);
	
}
