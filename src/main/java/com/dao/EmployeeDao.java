package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.entity.EmployeeEntity;
import com.repository.EmployeeRepository;

@Repository
public class EmployeeDao 
{
	@Autowired
	EmployeeRepository er;
	
	public String postAll(List<EmployeeEntity> e) {
		// TODO Auto-generated method stub
		er.saveAll(e);
		return "Saved Successfuly";
	}

	public List<EmployeeEntity> getAll() {
		// TODO Auto-generated method stub
		return er.findAll();
	}

	public EmployeeEntity getById(Integer id) {
		// TODO Auto-generated method stub
		return er.findById(id).orElse(null);
	}

	public String updateById(EmployeeEntity e,Integer id) {
		// TODO Auto-generated method stub
		EmployeeEntity temp = er.findById(id).get();
		temp.setName(e.getName());
		temp.setAge(e.getAge());
		temp.setGender(e.getGender());
		temp.setSalary(e.getSalary());
		er.save(temp);
		return "Updated Successfully";
	}

	public String updatesalaryById(EmployeeEntity e, Integer id) {
		// TODO Auto-generated method stub
		EmployeeEntity temp = er.findById(id).get();
		temp.setSalary(e.getSalary());
		er.save(temp);
		return "Updated Successfully";
	}

	public String deleteById(Integer id) {
		// TODO Auto-generated method stub
		er.deleteById(id);
		return "ID " + id + " deleted successfully";
	}

	public String deleteall() {
		// TODO Auto-generated method stub
		er.deleteAll();
		return "Deleted successfully";
	}

	public EmployeeEntity get2ndMax() {
		// TODO Auto-generated method stub
		return er.get2ndMax();
	}
	
	
}

