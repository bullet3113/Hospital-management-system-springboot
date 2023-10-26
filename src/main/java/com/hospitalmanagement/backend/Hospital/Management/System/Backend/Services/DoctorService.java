package com.hospitalmanagement.backend.Hospital.Management.System.Backend.Services;

import com.hospitalmanagement.backend.Hospital.Management.System.Backend.Models.Doctor;
import com.hospitalmanagement.backend.Hospital.Management.System.Backend.Repositories.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorService {

    @Autowired
    DoctorRepository doctorRepo;

    public void addDoctor(Doctor obj) {
        String docId = "Doctor" + (doctorRepo.getTotalDoctors() + 1);
        obj.setDocId(docId);
        doctorRepo.addDoctor(obj);
    }

    public Doctor getDoctorById(String docId) {
        return doctorRepo.getDoctorById(docId);
    }

    public void updateDoctorById(String docId, Doctor obj) {
        obj.setDocId(docId);
        doctorRepo.updateDoctorById(docId, obj);
    }

    public int getOverallDoctors() {
        return doctorRepo.getTotalDoctors();
    }
}
