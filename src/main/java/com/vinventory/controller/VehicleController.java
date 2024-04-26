package com.vinventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@GetMapping("/getVehicle/{make}")
	public List<Vehicle>  getCar(@PathVariable ("make") String make) {
		return service.getVehicle(make);
	}
	
	@PostMapping("/addVehicle")
	public String addVehicle(@RequestBody Vehicle vehicle) {
		
		return service.addVehicle(vehicle);
	}
	
	@PutMapping("/update/{id}")
	public String updateVehicle (@PathVariable("id") int id,@RequestBody Vehicle vehicle) {
		vehicle.setId(id);
		 return service.updateVehicle(vehicle);
		  
	}

	@DeleteMapping("/delete/{id}")
	public String removeVehicle(@PathVariable("id") int id) {
		return service.removeVehicle(id);
	}
	
	

}
