package com.example.file_validation.modal;

import com.sun.istack.NotNull;

import javax.persistence.*;

// Entity annotation defines that a
// class can be mapped to a table
@Entity
@Table(name = "custmodal")
public class SalesPersonModal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "salesID")
    long salesID;

    @NotNull
    @Column(name = "custName")
    String custName;

    @Column(name = "address")
    String address;

    public SalesPersonModal() {
        super();
    }
    public SalesPersonModal(String fileName, String content, String attribute) {
        super();
        this.custName = fileName;
        this.address = content;
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
}
