package com.example.cabbooking.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cabbooking.model.Ride;

public interface RideRepo extends JpaRepository<Ride,Integer> {

}
