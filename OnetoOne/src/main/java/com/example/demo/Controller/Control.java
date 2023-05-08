package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Car;
import com.example.demo.Model.CarDesign;
import com.example.demo.Repository.CarDesignRepo;
import com.example.demo.Repository.CarRepo;
import com.example.demo.Service.CarSer;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
public class Control {
	
	private static final String HttpStatus = null;
	@Autowired
	CarRepo crepo;
	@Autowired
	CarDesignRepo cdrepo;
	@Operation(summary = "Creates a new employee")
	@ApiResponses(value = {@ApiResponse(responseCode = "201", description = "Employee Created Successfully!"), @ApiResponse(responseCode = "400", description = "Employee is Invalid"), @ApiResponse(responseCode = "401", description = "Invalid Credentials")})
	@ResponseStatus(org.springframework.http.HttpStatus.CREATED)
	
	
	@Tag(name="view all car",description="show")
	@PostMapping(value = "/employee", produces = "application/json", consumes = "application/json")
	public Car saveCar(@RequestBody CarSer eRequest)
	{
		CarDesign dep = new CarDesign();
		dep.setColor(eRequest.getCarmodel());
		dep = cdrepo.save(dep);
		Car emp = new Car();
		emp.setCarDesign(dep);
		crepo.save(emp);
		return emp;
	}
	
	@Operation(summary = "Get all employees")
	@ApiResponses(value = {@ApiResponse(responseCode = "200", description = "Getting Employee Successfully!"), @ApiResponse(responseCode = "401", description = "Invalid Credentials"), @ApiResponse(responseCode = "404", description = "Employee not found!")})
	@Tag(name="view all emp",description="temp")
	@GetMapping(value = "/employee", produces = "application/json")
	public List<Car> getEmployees()
	{
		return crepo.findAll();
	}
	
	@Tag(name="view all Hello",description="see")
	@GetMapping("/department")
	public List<CarDesign> getDepartment()
	{
		return cdrepo.findAll();
	}
	
	@Tag(name="view all view",description="saw")
	@PutMapping("/pum")
	public Car updateCar(@RequestBody CarSer eRequest)
	{
		return cdrepo.updateCar(eRequest);
	}
	
	
	

}
