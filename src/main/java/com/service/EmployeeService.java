package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.EmployeeDao;
import com.entity.EmployeeEntity;

@Service 
public class EmployeeService 
{
	@Autowired
	EmployeeDao ed;
	
	public String postAll(List<EmployeeEntity> e) {
		// TODO Auto-generated method stub
		return ed.postAll(e);
	}

	public List<EmployeeEntity> getAll() {
		// TODO Auto-generated method stub
		return ed.getAll();
	}

	public EmployeeEntity getById(Integer id) {
		// TODO Auto-generated method stub
		return ed.getById(id);
	}

	public String updateById(EmployeeEntity e, Integer id) {
		// TODO Auto-generated method stub
		return ed.updateById(e,id);
	}

	public String updateSalaryById(EmployeeEntity e, Integer id) {
		// TODO Auto-generated method stub
		return ed.updatesalaryById(e,id);
	}

	public String deleteById(Integer id) {
		// TODO Auto-generated method stub
		return ed.deleteById(id);
	}

	public String deleteAll() {
		// TODO Auto-generated method stub
		return ed.deleteall();
	}

	public EmployeeEntity get2ndMax() {
		// TODO Auto-generated method stub
		return ed.get2ndMax();
	}
	
}
