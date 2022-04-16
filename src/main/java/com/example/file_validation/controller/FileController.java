package com.example.file_validation.controller;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import com.example.file_validation.modal.FileModal;
import com.example.file_validation.services.FileServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

// @Controller annotation is used to
// mark any java class as a controller class
@Controller
@RequestMapping("/api/file")
public class FileController {

    @Autowired
    FileServiceImplementation fileServiceImplementation;

    // @GetMapping annotation for
    // mapping HTTP GET requests onto
    // specific handler methods. */
    @GetMapping("/")
    public String getFileData() {
        return "File";
    }

    // @PostMapping annotation maps HTTP POST
    // requests onto specific handler methods
    @PostMapping("/uploadfiles")
    public void uploadFiles(File file){

    }


    /*public String uploadMultipartFile(@RequestParam("files") MultipartFile[] files, Model modal) {
        try {
            // Declare empty list for collect the files data
            // which will come from UI
            List<FileModal> fileList = new ArrayList<FileModal>();
            for (MultipartFile file : files) {
                String fileContentType = file.getContentType();
                String sourceFileContent = new String(file.getBytes(), StandardCharsets.UTF_8);
                String fileName = file.getOriginalFilename();
                FileModal fileModal = new FileModal(fileName, sourceFileContent, fileContentType);

                // Adding file into fileList
                fileList.add(fileModal);
            }

            // Saving all the list item into database
            fileServiceImplementation.saveAllFilesList(fileList);

        } catch (Exception e) {
            e.printStackTrace();
        }

        // Send file list to View using modal class
        // fileServiceImplementation.getAllFiles() used to
        // fetch all file list from DB
        modal.addAttribute("allFiles", fileServiceImplementation.getAllFiles());

        return "FileList";
    }*/
}
