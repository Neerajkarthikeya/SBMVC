package com.example.JFSDS25_SBMVC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeDAOClass implements EmployeeDAO{
	@Autowired 
	private EmployeeRepository er;
	@Override
	public String addEmp(Employee emp) {
		 er.save(emp); 
		 return "Employee saved";
	}

	

}
