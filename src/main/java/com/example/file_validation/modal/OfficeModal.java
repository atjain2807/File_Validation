package com.example.file_validation.modal;

import com.sun.istack.NotNull;

import javax.persistence.*;

// Entity annotation defines that a
// class can be mapped to a table
@Entity
@Table(name = "officeModal")
public class OfficeModal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "officeID")
    long officeID;

    @NotNull
    @Column(name = "officeName")
    String officeName;

    @Column(name = "address")
    String address;

    @Column(name = "primaryDoctor")
    private String primaryDoctor;

    public OfficeModal() {
        super();
    }
    public OfficeModal(String fileName, String content, String attribute) {
        super();
        this.officeName = fileName;
        this.address = content;
        this.primaryDoctor = attribute;
    }
    public String getOfficeName() {
        return officeName;
    }
    public void setOfficeName(String fileName) {
        this.officeName = fileName;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String content) {
        this.address = content;
    }
    public String getPrimaryDoctor() {
        return primaryDoctor;
    }
    public void setPrimaryDoctor(String fileType) {
        this.primaryDoctor = fileType;
    }
}
