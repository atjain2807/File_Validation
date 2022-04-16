package com.example.file_validation.repository;

import com.example.file_validation.modal.CustomerModal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface customerRepo extends JpaRepository<CustomerModal, Long> {

}