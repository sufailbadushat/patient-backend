package com.nest.patient_backend.controller;

import com.nest.patient_backend.dao.PatientDao;
import com.nest.patient_backend.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController

public class PatientController {

    @Autowired
    PatientDao patientDao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "add", consumes = "application/json", produces = "application/json")
    public  String AddPatient(@RequestBody Patient p) {



        patientDao.save(p);

        return "added successfully!";
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<Patient> ViewAllPatient()
    {
        return (List<Patient>)  patientDao.findAll();
    }

    @CrossOrigin(origins = "*")
    @PostMapping("/search")
    public List<Patient> SearchPatient(@RequestBody Patient p)
    {
        String patientId=String.valueOf(p.getPatientId());
        System.out.println(patientId);

        return (List<Patient>) patientDao.SearchPatient(p.getPatientId());

    }
}





