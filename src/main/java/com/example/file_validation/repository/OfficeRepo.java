package com.example.file_validation.repository;

import com.example.file_validation.modal.CustomerModal;
import com.example.file_validation.modal.OfficeModal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfficeRepo extends JpaRepository<OfficeModal, Long> {

}