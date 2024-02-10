package com.dealership.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dealership.model.Vehicle;
import com.dealershipl.service.VehicleService;

@RestController
@RequestMapping("/api")
public class VehicleController {
	
	@Autowired
	VehicleService service;
	
	@GetMapping("/getAllVehicles")
	public List<Vehicle> getAllVehicles(){
		
		
		return service.getAllVehicles();
		
	}
	
	@PostMapping("/addVehicle")
	public String addVehicle(@RequestBody Vehicle vehicle) {
		
		return service.addVehicle(vehicle);
	}
	
	

}
