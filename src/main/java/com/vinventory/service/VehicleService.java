package com.vinventory.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinventory.model.Vehicle;
import com.vinventory.repository.VehicleRepository;

@Service
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
