package com.dealershipl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dealership.VehicleRepository;
import com.dealership.model.Vehicle;

public class VehicleService {
	
	@Autowired
	VehicleRepository repo;
	
	
	public List<Vehicle> getAllVehicles(){
		
		
		return repo.findAll();
	}
	
	
	
	public String addVehicle(Vehicle vehicle) {
		
		repo.save(vehicle);
		
		return "The Vehicle has been added to the inventory";
	}

}
