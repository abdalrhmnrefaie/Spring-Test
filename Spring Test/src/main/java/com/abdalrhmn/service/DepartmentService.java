package com.abdalrhmn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abdalrhmn.entitiy.Department;
import com.abdalrhmn.repository.DepartmentRepo;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepo departmentRepo;

	public Department findById(Long id) {

		return departmentRepo.findById(id).orElseThrow();
	}

	public Department insert(Department department) {
		return departmentRepo.save(department);

	}

	public Department update(Department department) {
		Department current = departmentRepo.findById(department.getId()).orElseThrow();

		current.setName(department.getName());

		return departmentRepo.save(current);

	}

	public List<Department> findAll() {
		return departmentRepo.findAll();

	}
}
