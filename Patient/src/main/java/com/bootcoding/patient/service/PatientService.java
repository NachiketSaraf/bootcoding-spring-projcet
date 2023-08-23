package com.bootcoding.patient.service;

import com.bootcoding.patient.model.Patient;
import com.bootcoding.patient.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientService {

    @Autowired
    PatientRepository patientRepository;

    public List<Patient> getAllPatient(){

        return patientRepository.findAll();
    }

    public void savePatient(Patient patient){
        patientRepository.save(patient);
    }

    public void savePatient(List<Patient> patients){
        for(Patient patient: patients){
            patientRepository.save(patient);
        }
    }

    public Optional<Patient> getPatientById(int id) {
        return patientRepository.findById(id);
    }

    public void updatePatientById(Patient patient) {
        patientRepository.save(patient);
    }
}
