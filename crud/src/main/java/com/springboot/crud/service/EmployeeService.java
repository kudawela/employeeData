package com.springboot.crud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.crud.entity.Employee;
import com.springboot.crud.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;

	// insert employee
	public Employee save(Employee emp) {
		return employeeRepository.save(emp);	
	}
	
	public EmployeeRepository getEmployeeRepository() {
		return employeeRepository;
	}

	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
	
	// get employee
	public Employee getEmployee(int id) {
		return employeeRepository.findById(id).get();
	}

	// update employee
	public Employee update(Employee employee)
	{
		Employee emp = employeeRepository.findById(employee.getId()).get();
		emp.setName(employee.getName());
		emp.setAge(employee.getAge());
		
		return employeeRepository.save(emp);
	}
}
