package com.example.JFSDS25_SBMVC;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	Optional<Employee> findById(Integer id); 
} 
