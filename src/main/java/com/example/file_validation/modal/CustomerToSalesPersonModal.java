package com.example.file_validation.modal;

import javax.persistence.*;
import java.util.List;

// Entity annotation defines that a
// class can be mapped to a table
@Entity
@Table(name = "custmodal")
public class CustomerToSalesPersonModal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToMany
    @JoinColumn(name = "custmerID", referencedColumnName = "custId")
    @Column(name = "custmerID")
    List<CustomerModal> custmerID;

    @OneToOne
    @JoinColumn(name = "SalesPersonID", referencedColumnName = "salesID")
    @Column(name = "SalesPersonID")
    SalesPersonModal SalesPersonID;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CustomerToSalesPersonModal() {
        super();
    }

}
