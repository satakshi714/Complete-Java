package com.m8.hospital.doctor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.m8.hospital.doctor.entity.Doctor;
import com.m8.hospital.doctor.repositoty.DoctorRepository;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository repository;

    public Doctor addDoctor(Doctor doctor) {
        return repository.save(doctor);
    }

    public List<Doctor> getAllDoctors() {
        return repository.findAll();
    }

    public Doctor getDoctorById(int id) {
        return repository.findById(id).orElse(null);
    }
}