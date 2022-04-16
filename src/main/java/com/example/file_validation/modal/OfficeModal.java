package com.example.file_validation.modal;

import com.sun.istack.NotNull;

import javax.persistence.*;

// Entity annotation defines that a
// class can be mapped to a table
@Entity
@Table(name = "custmodal")
public class OfficeModal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "custId")
    long custId;

    @NotNull
    @Column(name = "custName")
    String custName;

    @Column(name = "address")
    String address;

    @Column(name = "primaryDoctor")
    private String primaryDoctor;

    public OfficeModal() {
        super();
    }
    public OfficeModal(String fileName, String content, String attribute) {
        super();
        this.custName = fileName;
        this.address = content;
        this.primaryDoctor = attribute;
    }
    public String getCustName() {
        return custName;
    }
    public void setCustName(String fileName) {
        this.custName = fileName;
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
