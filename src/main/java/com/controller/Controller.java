package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.EmployeeEntity;
import com.service.EmployeeService;

@RestController
@RequestMapping(value = "/employee")
public class Controller 
{
	@Autowired
	EmployeeService es;
	
	@PostMapping(value = "/postall")
	public String postAl(@RequestBody List<EmployeeEntity> e)
	{
		return es.postAll(e);
	}
	
	@GetMapping(value = "/getall")
	public List<EmployeeEntity> getAll()
	{
		return es.getAll();
	}
	
	@GetMapping(value = "/getbyid/{id}")
	public EmployeeEntity getById(@PathVariable Integer id)
	{
		return es.getById(id);
	}
	
	@PutMapping(value = "/updatebyid/{id}")
	public String updateById(@RequestBody EmployeeEntity e, @PathVariable Integer id)
	{
		return es.updateById(e,id);
	}
	
	@PatchMapping(value = "/updatesalarybyid/{id}")
	public String updateSalaryById(@RequestBody EmployeeEntity e, @PathVariable Integer id)
	{
		return es.updateSalaryById(e,id);
	}
	
	@DeleteMapping(value = "/deletebyid/{id}")
	public String deleteById(@PathVariable Integer id)
	{
		return es.deleteById(id);
	}
	
	@DeleteMapping(value = "/deleteall")
	public String deleteAll()
	{
		return es.deleteAll();
	}
	
	@GetMapping("/get2ndmaxsalary")
	public EmployeeEntity get2ndMax()
	{
		return es.get2ndMax();
	}
	
	@GetMapping("/get2ndminsalary")
	public EmployeeEntity get2ndmin()
	{
		return null;
	}
}
