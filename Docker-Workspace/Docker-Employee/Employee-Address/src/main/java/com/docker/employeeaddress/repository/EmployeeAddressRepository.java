package com.docker.employeeaddress.repository;

import com.docker.employeeaddress.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeAddressRepository extends JpaRepository<Address, Long> {
}
