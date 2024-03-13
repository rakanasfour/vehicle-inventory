package com.vinventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vinventory.model.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle,Integer> {
	
	

}
