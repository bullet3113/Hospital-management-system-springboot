package com.hospitalmanagement.backend.Hospital.Management.System.Backend.Repositories;

import com.hospitalmanagement.backend.Hospital.Management.System.Backend.Models.Patient;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class PatientRepository {

    Map<String, Patient> patientDB;
    private int overallPatients;

    public void setOverallPatients(int overallPatients) {
        this.overallPatients = overallPatients;
    }

    public PatientRepository() {
        this.patientDB = new HashMap<>();
        this.overallPatients = 0;
    }

    public Patient getPatientById(String patientId) {
        return this.patientDB.get(patientId);
    }

    public void addPatient(Patient obj) {
        this.patientDB.put(obj.getpId(), obj);
    }

    public void dischargePatientById(String patientId) {
        this.patientDB.remove(patientId);
    }

    public int getOverallPatients() {
        return this.overallPatients;
    }
}
