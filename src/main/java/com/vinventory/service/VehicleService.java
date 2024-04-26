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
	
	public List<Vehicle> getVehicle(String make){
		
		return repo.findByMake(make);
	}
	
	public String addVehicle(Vehicle vehicle) {
		
		repo.save(vehicle);
		
		return "The Vehicle has been added to the inventory";
	}
	
	public String updateVehicle(Vehicle vehicle) {
		
		repo.save(vehicle);
		
		return "the vehicle has been updated";
	}
	
	public String removeVehicle(int id) {
		repo.deleteById(id);
		
		return "the vehicle has been deleted";
	}

}
