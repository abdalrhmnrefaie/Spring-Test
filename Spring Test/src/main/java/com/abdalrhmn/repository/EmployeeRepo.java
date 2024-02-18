package com.abdalrhmn.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abdalrhmn.entitiy.Employee;

@Repository

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

	List<Employee> findByDepartmentId(Long deptId);

}
