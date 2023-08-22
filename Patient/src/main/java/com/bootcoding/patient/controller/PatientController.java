package com.bootcoding.patient.controller;

import com.bootcoding.patient.model.Patient;
import com.bootcoding.patient.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/patient/")
public class PatientController {
    @Autowired
    private PatientService patientService;

    @PostMapping("register")
    public String registerPatient(@RequestBody List<Patient> patients) {
        patientService.savePatient(patients);
        return "success";
    }

    @GetMapping("all")
    public List<Patient> getAllPatients() {
        return patientService.getAllPatient();
    }

    @GetMapping("name/{id}")
    public Optional<Patient> getPatientById(@PathVariable int id) {
        return patientService.getPatientById(id);
    }



}
