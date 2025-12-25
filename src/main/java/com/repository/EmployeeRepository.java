package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.entity.EmployeeEntity;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer>
{
	@Query(value = "SELECT * FROM employeetable "
			+ "ORDER BY salary DESC LIMIT 1 OFFSET 1", nativeQuery = true)
	EmployeeEntity get2ndMax();
	
}
