package com.example.cabbooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.cabbooking.model.Ride;
import com.example.cabbooking.service.RideService;

@RestController
@RequestMapping("/driver")
public class DriverController {
	
	@Autowired
	RideService rs1;
 
	@PutMapping("/started/{rideid}")
	public Ride get5(@PathVariable int rideid )
	{
		return rs1.startride(rideid);	
	}
	
	@PutMapping("/Completed/{rideid}")
	public Ride get6(@PathVariable int rideid )
	{
		return rs1.completeride(rideid);	
	}
	

	
	
}

