package com.abdalrhmn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abdalrhmn.entitiy.Employee;
import com.abdalrhmn.repository.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;

	public Employee findById(Long id) {

		return employeeRepo.findById(id).orElseThrow();
	}

	public Employee insert(Employee emp) {
		return employeeRepo.save(emp);

	}

	public Employee update(Employee emp) {
		Employee employee = employeeRepo.findById(emp.getId()).orElseThrow();

		employee.setName(emp.getName());
		employee.setSalary(emp.getSalary());
		employee.setDepartment(emp.getDepartment());
		return employeeRepo.save(employee);

	}

	public List<Employee> findByDepartmentId(Long deptId) {
		return employeeRepo.findByDepartmentId(deptId);

	}

	public List<Employee> findAll() {
		return employeeRepo.findAll();

	}

}
