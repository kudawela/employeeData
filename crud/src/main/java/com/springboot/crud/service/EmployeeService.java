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
		emp.setSalary(employee.getSalary());
		emp.setExperience(employee.getExperience());
		emp.setCompany(employee.getCompany());
		emp.setEducation(employee.getEducation());
		emp.setGender(employee.getGender());
		emp.setDob(employee.getDob());
		emp.setEmail(employee.getEmail());
		emp.setLastName(employee.getLastName());
		emp.setFirstName(employee.getFirstName());
		return employeeRepository.save(emp);
	}
	
	// delete the employee
	public String delete(int id) {
		employeeRepository.deleteById(id);
		return "Entity deleted " + id;
	}
}
