package com.fatihtoker.CrudApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fatihtoker.CrudApp.model.Employee;
import com.fatihtoker.CrudApp.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

}
