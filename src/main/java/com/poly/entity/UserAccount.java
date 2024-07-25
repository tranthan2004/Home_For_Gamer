package com.poly.entity;

import java.io.Serializable;
import java.util.Optional;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
@Entity
@Table(name = "Accounts")
public class UserAccount implements Serializable {
    @Id
    @Column(name = "username")
    private String Username;
    
    @Column(name = "password")
    private String password;
    
    @Column(name = "Admin")
    private boolean admin;
    
    @Column(name="Seller")
    private boolean seller;
    
    @OneToOne(mappedBy = "UserAcc")
    UserInformation users;
}