package com.hospitalmanagement.backend.Hospital.Management.System.Backend.Controller;

import com.hospitalmanagement.backend.Hospital.Management.System.Backend.Models.Patient;
import com.hospitalmanagement.backend.Hospital.Management.System.Backend.Services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class PatientController {

    @Autowired
    PatientService patientService;

    @GetMapping("/api/patient")
    public Patient getPatientById(@RequestParam String patientId) {
        return patientService.getPatientDetailsById(patientId);
    }

    @PostMapping("/api/patient/addpatient")
    public String addPatient(@RequestBody Patient obj) {
        patientService.addPatient(obj);
        return "Patient added successfully";
    }

    @DeleteMapping("/api/patient")
    public String dischargePatientById(@RequestParam String patientId) {
        patientService.dischargePatient(patientId);
        return "Patient discharge(Deleted) successfully";
    }
}
