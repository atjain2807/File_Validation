package com.example.file_validation.repository;

import com.example.file_validation.modal.FileModal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// @Repository annotation is used to
// indicate that the class provides the mechanism
// for storage, retrieval, search,update and delete
// operation on objects.
@Repository
public interface FileRepository extends JpaRepository<FileModal, Long> {

}
