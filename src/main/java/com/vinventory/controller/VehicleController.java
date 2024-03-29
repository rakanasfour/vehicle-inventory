package com.vinventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vinventory.model.Vehicle;
import com.vinventory.service.VehicleService;

@CrossOrigin(origins = "http://localhost:3000")
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
