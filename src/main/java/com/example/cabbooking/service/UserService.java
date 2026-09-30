package com.example.cabbooking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.cabbooking.model.*;
import com.example.cabbooking.dao.*;
@Service
public class UserService {

	@Autowired
	UserRepo ur;
	
	public User adduser(User u) {
		return ur.save(u);
	}
}
