package com.docker.employeeservice.repository;

import com.docker.employeeservice.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeServiceRepository extends JpaRepository<Employee, Long> {
}
