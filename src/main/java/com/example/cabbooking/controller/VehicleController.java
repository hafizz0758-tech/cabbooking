package com.example.cabbooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.cabbooking.service.*;
import com.example.cabbooking.model.*;
@RestController
public class VehicleController {

	@Autowired
	VehicleService vs;
	
	@PostMapping("/registervehicle")
	public Vehicle get2( @RequestBody Vehicle v) {
		return vs.addvehicle(v);
	}
}
