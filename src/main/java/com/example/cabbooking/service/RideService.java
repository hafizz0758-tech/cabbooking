package com.example.cabbooking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cabbooking.dao.RideRepo;
import com.example.cabbooking.dao.UserRepo;
import com.example.cabbooking.dto.RideRequest;
import com.example.cabbooking.model.Ride;
import com.example.cabbooking.model.RideStatus;
import com.example.cabbooking.model.User;

@Service
public class RideService {

	
	@Autowired
	RideRepo rr;

	@Autowired
	UserRepo ur1;
	
	public Ride requestride(int passengerid,RideRequest request)
	{
	
		Ride ride=new Ride();
		ride.setPassenger(ur1.findById(passengerid).get());
		ride.setPickuplocation(request.getPickuplocation());
		ride.setDroplocation(request.getDroplocation());
		ride.setStatus(RideStatus.REQUESTED);
		ride.setFare(100);
		
		return rr.save(ride);
	}
	
	public Ride assigndriver(int rideid, int driverid) {
		
		Ride r=rr.findById(rideid).get();
		User driver=ur1.findById(driverid).get();
		r.setDriver(driver);
		r.setStatus(RideStatus.ACCEPTED);
		return rr.save(r);
		
		
	}
	
	public Ride startride(int rideid)
	{
		Ride r1=rr.findById(rideid).get();
		r1.setStatus(RideStatus.STARTED);
		return rr.save(r1);
	}
	
	public Ride completeride(int rideid)
	{
		Ride r2=rr.findById(rideid).get();
		r2.setStatus(RideStatus.COMPLETED);
		return rr.save(r2);
	}
	
	
	public Ride cancelride(int rideid)
	{
	
		Ride r3=rr.findById(rideid).get();
		r3.setStatus(RideStatus.CALCELED);
		return rr.save(r3);
	}
	
}
