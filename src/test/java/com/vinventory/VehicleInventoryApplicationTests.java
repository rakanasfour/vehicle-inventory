package com.vinventory;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.vinventory.model.Type;
import com.vinventory.model.Vehicle;
import com.vinventory.repository.VehicleRepository;


@SpringBootTest
public class VehicleInventoryApplicationTests {
	
	
	 @Test
	    public void testTheEnum() {
		 	// Test if the model accept the enum
	        // Given
	        Vehicle vehicle = new Vehicle();
	        vehicle.setId(4);
	        vehicle.setImage("test");
	        vehicle.setType(Type.SUV);
	        vehicle.setBrand("Toyota");
	        vehicle.setModel("Camry");
	        vehicle.setYear(2023);	
	        vehicle.setPrice(30000);
	        // When
	        Type type = vehicle.getType();
	        
	        // Then
	        assertEquals(Type.SUV, type); 
	    }
	


		@Autowired
		private VehicleRepository repo;

		@Test
		public void testSave() {
			Vehicle i = new Vehicle();
			i.setId(4);
			i.setImage("test");
			i.setType(Type.SUV);
			i.setBrand("Toyota");
			i.setModel("Camry");
			i.setYear(2023);	
			i.setPrice(30000);
	
			repo.save(i);
			assertNotNull(repo.findById(4).get());
		}
		
		@Test
		public void testDisplayAll() {
			
			List<Vehicle>list = repo.findAll();
			assertThat(list).size().isGreaterThan(0);
			
		}
		
}
