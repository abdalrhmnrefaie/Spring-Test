package com.abdalrhmn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abdalrhmn.entitiy.Department;

@Repository
public interface DepartmentRepo extends JpaRepository<Department, Long> {

}
