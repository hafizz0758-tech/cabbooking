package com.example.cabbooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.cabbooking.model.Ride;
import com.example.cabbooking.service.RideService;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	RideService rs1;
	
	@PutMapping("/assign/{rideid}/{driverid}")
	public Ride get4(@PathVariable int rideid,@PathVariable int driverid )
	{
		return rs1.assigndriver(rideid,driverid);	
	}
	
	
}
