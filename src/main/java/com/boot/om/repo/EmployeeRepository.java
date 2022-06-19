package com.boot.om.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.om.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
