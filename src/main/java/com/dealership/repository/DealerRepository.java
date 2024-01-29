package com.dealership.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.dealership.model.Car;

public interface DealerRepository extends JpaRepository<Car,Integer> {
	//Query(value="SELECT * FROM dealership.car where brand = ?1 ", nativeQuery=true)
	List<Car> findByBrand(String brand);

	

	
}
