package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.LoginModel;

@Repository
public interface LoginRepo extends JpaRepository<LoginModel,Integer> {

}
