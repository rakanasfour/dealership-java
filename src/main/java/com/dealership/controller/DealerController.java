package com.dealership.controller;

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

import com.dealership.model.Car;
import com.dealership.service.DealerService;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class DealerController {
	
	@Autowired
	private DealerService service;
	
	
	@GetMapping("/getAllCars")
	public List<Car> getAllCars(){
		return service.getAllCars();
		
	}


	@GetMapping("{brand}")
	public List<Car>  getCar(@PathVariable ("brand") String brand) {
		return service.getCar(brand);
	}
	
	@PostMapping( "/addCar")
	public String addCar(@RequestBody Car car) {
		return service.addCar(car);
	}
	

	@PutMapping("/update/{id}")
	public String updateCar(@PathVariable("id") int id,@RequestBody Car car) {
		car.setId(id);
		return service.updateCar(car);
	}

	@DeleteMapping("/delete/{id}")
	public String removeCar(@PathVariable("id") int id) {
		return service.removeCar(id);
	}
}
