package com.example.file_validation.repository;

import com.example.file_validation.modal.CustomerModal;
import com.example.file_validation.modal.DoctorModal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface doctorRepo extends JpaRepository<DoctorModal, Long> {

}