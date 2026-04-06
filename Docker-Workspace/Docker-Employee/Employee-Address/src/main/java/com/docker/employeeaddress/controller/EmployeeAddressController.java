package com.docker.employeeaddress.controller;

import com.docker.employeeaddress.model.Address;
import com.docker.employeeaddress.repository.EmployeeAddressRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/addresses")
public class EmployeeAddressController {
    private final EmployeeAddressRepository repo;

    public EmployeeAddressController(EmployeeAddressRepository repo){
        this.repo = repo;
    }

    @PostMapping
    public Address save(@RequestBody Address c) {
        return repo.save(c);
    }

    @GetMapping
    public List<Address> getAll() {
        return repo.findAll();
    }
}
