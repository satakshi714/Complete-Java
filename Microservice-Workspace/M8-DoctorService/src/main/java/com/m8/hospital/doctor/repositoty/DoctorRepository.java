package com.m8.hospital.doctor.repositoty;

import org.springframework.data.jpa.repository.JpaRepository;
import com.m8.hospital.doctor.entity.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor,Integer> {

}