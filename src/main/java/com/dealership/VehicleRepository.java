package com.dealership;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dealership.model.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {

}
