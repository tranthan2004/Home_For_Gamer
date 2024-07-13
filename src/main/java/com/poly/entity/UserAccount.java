package com.poly.entity;

import java.io.Serializable;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Accounts")
public class UserAccount implements Serializable {
    @Id
    @Column(name = "username")
    private String Username;
    
    @Column(name = "password")
    private String password;
    
    @Column(name = "lessor")
    private boolean Lessor;
    
    @Column(name = "sell")
    private boolean Sell;
    
    @OneToOne(mappedBy = "UserAcc")
    UserInformation users;
}
