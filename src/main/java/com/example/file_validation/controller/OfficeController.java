package com.example.file_validation.controller;

import com.example.file_validation.modal.OfficeModal;
import com.example.file_validation.repository.OfficeRepo;
import com.example.file_validation.repository.customerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// @Controller annotation is used to
// mark any java class as a controller class
@Controller
@RequestMapping("/api/office")
public class OfficeController {

    @Autowired
    public OfficeRepo officeRepo;

    // @GetMapping annotation for
    // mapping HTTP GET requests onto
    // specific handler methods. */
    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public List<OfficeModal> getOfficeData()
     {
        return officeRepo.findAll();
    }

    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public void createOffice(@RequestBody OfficeModal officeModal) {
        officeRepo.save(officeModal);
    }
}
