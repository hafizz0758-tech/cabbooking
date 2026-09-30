package com.example.cabbooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.cabbooking.model.*;
import com.example.cabbooking.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService us;
	
	@PostMapping("/register")
	public User get1(@RequestBody User u) {
		return us.adduser(u);
	}
	
	
}
