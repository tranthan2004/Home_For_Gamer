package com.poly.entity;

import java.io.Serializable;
import java.util.List;

import org.hibernate.annotations.Collate;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Data
@Entity
@Table(name = "ListAccountRent")
public class ListAccountRent implements  Serializable {
	@Id
	@Column(name = "NameAccountRent")
    private String nameaccount;
	
	@Column(name = "password")
    private String password;
	
	@Column(name = "Status")
    private String status;
	
	@Column(name = "Createday")
	@Temporal(TemporalType.DATE)
    private String createday;
	
	@Column(name = "Price")
    private double price;
	
	
	@Column(name = "Image")
    private String image;
	
	@Column(name = "Image1")
    private String image1;
    
    @Column(name = "Image2")
    private String image2;
    
    @Column(name = "Image3")
    private String image3;
    
    @OneToMany(mappedBy = "ListAccRent")
    List<BillDetail> billdetails;
    

}
