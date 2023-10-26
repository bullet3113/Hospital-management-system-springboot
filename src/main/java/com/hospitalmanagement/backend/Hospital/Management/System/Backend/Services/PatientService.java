package com.hospitalmanagement.backend.Hospital.Management.System.Backend.Services;

import com.hospitalmanagement.backend.Hospital.Management.System.Backend.Models.Patient;
import com.hospitalmanagement.backend.Hospital.Management.System.Backend.Repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {

    @Autowired
    PatientRepository patientRepo;

    public void addPatient(Patient obj) {
        String pId = "Patient" + (patientRepo.getOverallPatients() + 1);
        patientRepo.setOverallPatients(patientRepo.getOverallPatients() + 1);
        obj.setpId(pId);
        patientRepo.addPatient(obj);
    }

    public void dischargePatient(String patientId) {
        patientRepo.dischargePatientById(patientId);
    }

    public Patient getPatientDetailsById(String patientId) {
        return patientRepo.getPatientById(patientId);
    }
}
