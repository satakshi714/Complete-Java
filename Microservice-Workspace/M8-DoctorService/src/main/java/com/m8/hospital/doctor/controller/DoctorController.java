package com.m8.hospital.doctor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.m8.hospital.doctor.entity.Doctor;
import com.m8.hospital.doctor.service.DoctorService;

@RestController
@RequestMapping("/doctors")
public class DoctorController {

    @Autowired
    private DoctorService service;

    @PostMapping
    public Doctor addDoctor(@RequestBody Doctor doctor) {
        return service.addDoctor(doctor);
    }

    @GetMapping
    public List<Doctor> getAllDoctors() {
        return service.getAllDoctors();
    }

    @GetMapping("/{id}")
    public Doctor getDoctorById(@PathVariable int id) {
        return service.getDoctorById(id);
    }
}