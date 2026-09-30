package com.example.cabbooking.model;

import jakarta.persistence.*;
import jakarta.persistence.GenerationType;

@Entity

public class Vehicle {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	String vehicleno;
	String vehicletype;
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vehicle(String vehicleno, String vehicletype) {
		super();
		this.vehicleno = vehicleno;
		this.vehicletype = vehicletype;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getVehicleno() {
		return vehicleno;
	}
	public void setVehicleno(String vehicleno) {
		this.vehicleno = vehicleno;
	}
	public String getVehicletype() {
		return vehicletype;
	}
	public void setVehicletype(String vehicletype) {
		this.vehicletype = vehicletype;
	}
	
}
