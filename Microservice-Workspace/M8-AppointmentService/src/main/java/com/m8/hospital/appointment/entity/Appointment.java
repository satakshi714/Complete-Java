package com.m8.hospital.appointment.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Appointment {

    @Id
    private int appointmentId;
    private int patientId;
    private int doctorId;
    private String appointmentDate;

    public Appointment() {}

    public int getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(int appointmentId) {
        this.appointmentId = appointmentId;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }
}