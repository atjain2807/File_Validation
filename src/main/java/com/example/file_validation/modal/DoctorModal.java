package com.example.file_validation.modal;

import com.sun.istack.NotNull;

import javax.persistence.*;

// Entity annotation defines that a
// class can be mapped to a table
@Entity
@Table(name = "docmodal")
public class DoctorModal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "docId")
    long docId;

    @NotNull
    @Column(name = "docName")
    String docName;

    public DoctorModal() {
        super();
    }
    public DoctorModal(String fileName, String content, String attribute) {
        super();
        this.docName = fileName;
    }
    public String getDocName() {
        return docName;
    }
    public void setDocName(String fileName) {
        this.docName = fileName;
    }
}
