package com.m8.hospital.patient.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.m8.hospital.patient.entity.Patient;

public interface PatientRepository extends JpaRepository<Patient,Integer> {

}