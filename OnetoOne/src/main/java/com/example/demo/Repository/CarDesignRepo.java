package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Car;
import com.example.demo.Model.CarDesign;
import com.example.demo.Service.CarSer;



public interface CarDesignRepo extends JpaRepository<CarDesign , Integer> {

	Car updateCar(CarSer eRequest);

}
