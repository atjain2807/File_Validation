package com.example.file_validation.controller;

import com.example.file_validation.modal.DoctorModal;
import com.example.file_validation.repository.doctorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// @Controller annotation is used to
// mark any java class as a controller class
@Controller
@RequestMapping("/api/doctor")
public class DoctorController {

    @Autowired
    public doctorRepo doctorRepo;

    // @GetMapping annotation for
    // mapping HTTP GET requests onto
    // specific handler methods. */
    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public List<DoctorModal> getCustomerData()
     {
        return doctorRepo.findAll();
    }

    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public void createCustomer(@RequestBody DoctorModal customerModal) {
        doctorRepo.save(customerModal);
    }
}
