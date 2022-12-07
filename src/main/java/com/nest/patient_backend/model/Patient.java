package com.nest.patient_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "patients")
public class Patient {

    @Id
    @GeneratedValue
    private int id;
    private String patientName;
    private String patientId;
    private String address;
    private String contactNumber;
    private String dateOfAppoinmet;
    private String doctorName;

    public Patient() {
    }

    public Patient(int id, String patientName, String patientId, String address, String contactNumber, String dateOfAppoinmet, String doctorName) {
        this.id = id;
        this.patientName = patientName;
        this.patientId = patientId;
        this.address = address;
        this.contactNumber = contactNumber;
        this.dateOfAppoinmet = dateOfAppoinmet;
        this.doctorName = doctorName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getDateOfAppoinmet() {
        return dateOfAppoinmet;
    }

    public void setDateOfAppoinmet(String dateOfAppoinmet) {
        this.dateOfAppoinmet = dateOfAppoinmet;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }
}
