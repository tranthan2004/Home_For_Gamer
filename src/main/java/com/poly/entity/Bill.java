package com.poly.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import jakarta.persistence.*;

@Data
@Entity
@Table(name = "Bills")
public class Bill implements Serializable {
    
    @Id
    @Column(name = "bill_ID")
    private String BillID;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "CreateDate")
    private Date createDate = new Date();
    
    @Column(name = "hour")
    private String Hour;
    
    @ManyToOne
    @JoinColumn(name = "cus_id")
    Userinformation UserInf;
    
    @OneToMany(mappedBy = "bill")
    List<BillDetail> billDetails;
}
