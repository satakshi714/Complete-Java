package com.m8.hospital.appointment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.m8.hospital.appointment.entity.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment,Integer>{

}