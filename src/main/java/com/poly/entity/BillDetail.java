package com.poly.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.*;

@Data
@Entity
@Table(name = "BillDetails")
public class BillDetail implements Serializable {
    
    @Id
    @Column(name = "bill_Detail_ID")
    private String Bill_Detail_ID;
    
    @Column(name = "quantity")
    private int Quantity;
    
    @ManyToOne
    @JoinColumn(name = "Bill_ID")
    Bill bill; 
    
    @ManyToOne
    @JoinColumn(name = "NameAccountRent")
    ListAccountRent ListAccRent;
    
    @ManyToOne
    @JoinColumn(name = "NameAccountTrade")
    ListAccountTrade ListAccTrade;
    
}
