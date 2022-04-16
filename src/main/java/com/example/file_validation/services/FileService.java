package com.example.file_validation.services;

import com.example.file_validation.modal.FileModal;

import java.util.List;

public interface FileService {
    List<FileModal> getAllFiles();
    void saveAllFilesList(List<FileModal> fileList);
}
