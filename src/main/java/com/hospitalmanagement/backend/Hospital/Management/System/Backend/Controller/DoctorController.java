package com.hospitalmanagement.backend.Hospital.Management.System.Backend.Controller;

import com.hospitalmanagement.backend.Hospital.Management.System.Backend.Models.Doctor;
import com.hospitalmanagement.backend.Hospital.Management.System.Backend.Services.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DoctorController {

    @Autowired
    DoctorService doctorService;

    @GetMapping("/api/doctor")
    public Doctor getDoctorById(@RequestParam String docId) {
        return doctorService.getDoctorById(docId);
    }

    @GetMapping("/api/doctor/all")
    public int getOverallDoctor() {
        return doctorService.getOverallDoctors();
    }

    @PostMapping("/api/doctor")
    public String addDoctorById(@RequestBody Doctor obj) {
        doctorService.addDoctor(obj);
        return "Doctor added successfully";
    }

    @PutMapping("/api/doctor")
    public String updateDoctorById(@RequestParam String docId, @RequestBody Doctor obj) {
        doctorService.updateDoctorById(docId, obj);
        return "Doctor updated successfully";
    }
}
