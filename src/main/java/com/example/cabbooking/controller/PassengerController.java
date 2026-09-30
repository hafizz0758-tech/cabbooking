 package com.example.cabbooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.cabbooking.dto.*;
import com.example.cabbooking.model.Ride;
import com.example.cabbooking.service.RideService;

@RestController
@RequestMapping("/passenger")
public class PassengerController {

	@Autowired
	RideService rs;
	
	@PostMapping("/ride/{passengerid}")
	public Ride get3(@PathVariable int passengerid,@RequestBody RideRequest request) {
	
		return rs.requestride(passengerid, request);
		
		
		
		
	}
	
	
}
