package com.example.demo.Service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Model.CarDesign;
import com.example.demo.Model.PageModel;
import com.example.demo.Repository.PageRepo;
import com.example.demo.Repository.RepoLogin;

@Service
public class ProductSer {
	@Autowired PageRepo pr;
	@Autowired RepoLogin rl;
	
	public String addSubscriber(CarDesign p)
	{
		pr.save(p);
		return "Added!";
	}
	
	public List<CarDesign> get()
	{
		return pr.findAll();
	}
	
	public List<CarDesign> getSubscriberById(int no)
	{
		return pr.findAll();
	}
	
	public String updateVehicle(CarDesign p)
	{
		pr.save(p);
		return "Updated!";
	}
	
	public String deleteByRequestParamId(int no )
	{
		pr.deleteById(no);
		return "Deleted!";
	}

	
	public List<CarDesign> getProDetails(@RequestParam String field)
	{
		return pr.findAll(Sort.by(Direction.ASC,field));
	}

	public List<CarDesign> getProwithPag(int offset, int pagesize)
	{
		Page<CarDesign> page=pr.findAll(PageRequest.of(offset, pagesize));
		return page.getContent();
	}
	
	
	public String validate(String Username, String Password)
	{
		PageModel userData = rl.findByUname(Username);
		if(userData == null)
		{
			return "User Not Found!";
		}
		else
		{
			if(userData.getPass().equals(Password))
			{
				return "Login Successful! Welcome :)";
			}
			else
			{
				return "Wrong Password";
			}
		}
	}
	public List<PageModel> getUname()
	{
		return rl.findAll();
	}
	public List<CarDesign> getCustomer()
	{
		return pr.findAll();
	}
	public Optional<CarDesign> getCustomerById(int no)
	{
		return pr.findById(no);
	}

	public String newUserAdd(PageModel pl)
	{
		rl.save(pl);
		return "User Added!";
	}

	
	public List<CarDesign> getSortedAsc(String field) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<CarDesign> getPaginate(int offset, int pagesize) {
		// TODO Auto-generated method stub
		return null;
	}

	public String changeUserPwd(PageModel pl) {
		// TODO Auto-generated method stub
		return null;
	}

	public String addPageModel(CarDesign p) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<CarDesign> getSortedDesc(String field) {
		// TODO Auto-generated method stub
		return null;
	}

	public Optional<CarDesign> getById(int job_card) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<CarDesign> getSubscriber() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getUname(PageModel pl) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
}
