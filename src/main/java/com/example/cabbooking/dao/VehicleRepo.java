package com.example.cabbooking.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cabbooking.model.Vehicle;

public interface VehicleRepo extends JpaRepository<Vehicle,Integer>{

}
