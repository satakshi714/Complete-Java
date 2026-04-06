package com.m8.hospital.patient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.m8.hospital.patient.entity.Patient;
import com.m8.hospital.patient.service.PatientService;

@RestController
@RequestMapping("/patients")
public class PatientController {

    @Autowired
    private PatientService service;

    @PostMapping
    public Patient addPatient(@RequestBody Patient patient) {
        return service.addPatient(patient);
    }

    @GetMapping
    public List<Patient> getAllPatients() {
        return service.getAllPatients();
    }

    @GetMapping("/{id}")
    public Patient getPatientById(@PathVariable int id) {
        return service.getPatientById(id);
    }
}