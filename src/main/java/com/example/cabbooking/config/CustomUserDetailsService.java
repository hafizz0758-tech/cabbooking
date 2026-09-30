package com.example.cabbooking.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.example.cabbooking.model.*;
import com.example.cabbooking.dao.*;
@Service
public class CustomUserDetailsService implements UserDetailsService {

	
	@Autowired
	UserRepo ur11;
	@Override
	public UserDetails loadUserByUsername(String id) throws UsernameNotFoundException {
		
		User user=ur11.findById(Integer.parseInt(id)).orElseThrow(()->new UsernameNotFoundException("Invaild id")); 
		
		return org.springframework.security.core.userdetails.User
				.withUsername(String.valueOf(user.getId()))
				.password(user.getPassword())
				.username(user.getName())
				.build();

	}
}
