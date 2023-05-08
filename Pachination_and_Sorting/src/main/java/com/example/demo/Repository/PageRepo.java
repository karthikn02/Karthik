package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.CarDesign;



@Repository
public interface PageRepo extends JpaRepository<CarDesign , Integer> {

}
