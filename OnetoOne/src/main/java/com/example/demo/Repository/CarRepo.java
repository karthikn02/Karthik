package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Car;
@Repository
public interface CarRepo extends JpaRepository <Car , Integer>{
	@Query(value="Select e from Car e join e CarDesign.cd", nativeQuery = true)
	public List<Car> getAllCar();

}
