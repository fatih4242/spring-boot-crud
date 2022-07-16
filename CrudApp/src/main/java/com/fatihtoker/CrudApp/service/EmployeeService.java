package com.fatihtoker.CrudApp.service;

import java.util.List;

import com.fatihtoker.CrudApp.model.Employee;

public interface EmployeeService {
	List<Employee> getAllEmployees();
	void saveEmployee(Employee employee);
	Employee getEmployeeById(long id);
	void deleteEmplooye(Employee employee);
}
