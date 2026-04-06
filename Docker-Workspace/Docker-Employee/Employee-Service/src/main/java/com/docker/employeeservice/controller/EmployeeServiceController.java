package com.docker.employeeservice.controller;

import com.docker.employeeservice.model.Employee;
import com.docker.employeeservice.repository.EmployeeServiceRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeServiceController {

    private final EmployeeServiceRepository repo;

    public EmployeeServiceController(EmployeeServiceRepository repo){
        this.repo = repo;
    }

    @PostMapping
    public Employee save(@RequestBody Employee c) {
        return repo.save(c);
    }

    @GetMapping
    public List<Employee> getAll() {
        return repo.findAll();
    }
}


