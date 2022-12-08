package com.nest.patient_backend.dao;

import com.nest.patient_backend.model.Patient;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface PatientDao extends CrudRepository<Patient,Integer> {

    @Query(value = "SELECT `id`, `address`, `contact_number`, `date_of_appoinmet`, `doctor_name`, `patient_id`, `patient_name` FROM `patients` WHERE `patient_id` =:patient_id", nativeQuery = true)
    List<Patient> SearchPatient(@Param("patient_id") String patient_id);

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM `patients` WHERE `id`=:id",nativeQuery = true)
    void DeletePatient(@Param("id") Integer id);

}
