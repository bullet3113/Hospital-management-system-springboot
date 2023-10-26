package com.hospitalmanagement.backend.Hospital.Management.System.Backend.Repositories;

import com.hospitalmanagement.backend.Hospital.Management.System.Backend.Models.Doctor;
import org.springframework.stereotype.Repository;

import javax.print.Doc;
import java.util.HashMap;
import java.util.Map;

@Repository
public class DoctorRepository {

    private Map<String, Doctor> docDB;
    private int overallDoctors;

    public DoctorRepository() {
        this.docDB = new HashMap<>();
        this.overallDoctors = 0;
    }

    public void addDoctor(Doctor obj) {
        this.overallDoctors++;
        docDB.put(obj.getDocId(), obj);
    }

    public Doctor getDoctorById(String docId) {
        return docDB.get(docId);
    }

    public int getTotalDoctors() {
        return docDB.size();
    }

    public void updateDoctorById(String docId, Doctor obj) {
        docDB.put(docId, obj);
    }
}
