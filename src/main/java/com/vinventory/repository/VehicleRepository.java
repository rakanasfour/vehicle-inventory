package com.vinventory.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.vinventory.model.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle,Integer> {
	
	@Query(value="SELECT * FROM vehicle_inventory_service.vehicle where make = ?1 ", nativeQuery=true)
	List<Vehicle> findByMake(String make);

	

}
