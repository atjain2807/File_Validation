package com.example.file_validation.controller;

import com.example.file_validation.modal.CustomerModal;
import com.example.file_validation.repository.customerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// @Controller annotation is used to
// mark any java class as a controller class
@Controller
@RequestMapping("/api/customer")
public class CustomerController {

    @Autowired
    public customerRepo customerRepo;

    // @GetMapping annotation for
    // mapping HTTP GET requests onto
    // specific handler methods. */
    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public List<CustomerModal> getCustomerData()
     {
        return customerRepo.findAll();
    }

    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public void createCustomer(@RequestBody CustomerModal customerModal) {
        customerRepo.save(customerModal);
    }
}
