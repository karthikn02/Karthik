package com.example.demo.Controller;



import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.CarDesign;
import com.example.demo.Model.PageModel;
import com.example.demo.Service.ProductSer;

@RestController
@RequestMapping("/cus")
public class Control {
	@Autowired ProductSer s;


	
	@PostMapping("")
	public String create(@RequestBody CarDesign p)
	{
		return s.addSubscriber(p);
	}
	
	
	@GetMapping("/gel")

	public List<CarDesign> read1()
	{
		return s.getCustomer();
	}
	
	
    @GetMapping("/{id}")
	public  Optional<CarDesign>readById1(@PathVariable int no)
	{
		return s.getCustomerById(no);
	}
    
	
	@GetMapping("")
	public List<CarDesign> read()
	{
		return s.getSubscriber();
	}
	
	
	@GetMapping("/{sm}")
	public Optional<CarDesign> readById(@PathVariable int job_card)
	{
		return s.getById(job_card);
	}
	
	@PutMapping("/update")
	public String update(@RequestBody CarDesign p)
	{
		return s.updateVehicle(p);
	}
	
	
	@DeleteMapping("/delete/{sm}")
	public String delete(@PathVariable int job_card)
	{
		return s.deleteByRequestParamId(job_card);
	}
	@GetMapping("/service")
	public List<CarDesign> getProSorted(@RequestParam String field)
	{
		return s.getProDetails(field);
	}
		
		
	@GetMapping("/service/{offset}/{pagesize}")
	public List<CarDesign> getProwithPagination(@PathVariable int offset,@PathVariable int pagesize)
	{
		return s.getPaginate(offset, pagesize);
	}

	
	
	@PostMapping("/open")
	public String login(@RequestBody Map<String,String> mp)
	{
		String uname = mp.get("uname");
		String pass = mp.get("pass");
		return s.validate(uname, pass);
	}
	
	
	@GetMapping("/get")
	public List<PageModel> listAll()
	{
		return s.getUname();
	}
	
	
	@PostMapping("/login/own")
	public String newUser(@RequestBody PageModel pl)
	{
	   return s.newUserAdd(pl);
	}
	
	
	@PutMapping("/login/changepwd")
	public String changePwd(@RequestBody PageModel pl)
	{
		return s.changeUserPwd(pl);
	}
	
	
  }
