package com.fatihtoker.CrudApp.service;

import java.util.List;
import java.util.Optional;

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

	@Override
	public void saveEmployee(Employee employee) {
		this.employeeRepository.save(employee);
		
	}

	@Override
	public Employee getEmployeeById(long id) {
		Optional<Employee> optional = employeeRepository.findById(id);
		Employee employee = null;
		if (optional.isPresent()) {
			employee = optional.get();
			
		}else {
			throw new RuntimeException("Employee not found for id : "+id);
		}
		return employee;
	}

	@Override
	public void deleteEmplooye(Employee employee) {
		this.employeeRepository.delete(employee);
		
	}

}
