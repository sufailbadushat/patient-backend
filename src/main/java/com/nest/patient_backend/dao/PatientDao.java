package com.nest.patient_backend.dao;

import com.nest.patient_backend.model.Patient;
import org.springframework.data.repository.CrudRepository;


public interface PatientDao extends CrudRepository<Patient,Integer> {
}
