package com.example.cabbooking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cabbooking.dao.VehicleRepo;
import com.example.cabbooking.model.Vehicle;

@Service
public class VehicleService {

	@Autowired
	VehicleRepo vr;
	
	public Vehicle addvehicle(Vehicle v) {
		
		return vr.save(v);
	}
}
