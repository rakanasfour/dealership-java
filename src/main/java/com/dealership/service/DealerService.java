package com.dealership.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dealership.model.Car;
import com.dealership.repository.DealerRepository;
@Service
public class DealerService {
	
	
	@Autowired
	private DealerRepository repo;
	
	
	public List<Car> getAllCars(){
		
		return repo.findAll();
	}
	
	
	public List<Car> getCar(String  brand) {
		
		return repo.findByBrand(brand);
		
	}
	
	public String addCar(Car car) {
		repo.save(car);
		return "The car has been added";
	}
	
	
	
	
	public String updateCar(Car car) {
		
		repo.save(car);	
		return "the car has been updated";
	}
	
	public String removeCar(int id) {
		
		repo.deleteById(id);
		return "the car has been removed";

	}
	
	
	
	
	

}
