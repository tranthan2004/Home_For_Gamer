package com.poly.entity;

import java.io.Serializable;
import java.util.List;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Users")
public class UserInformation implements Serializable {

    @Id
    @Column(name = "UserID")
    private String userID;
    
    @Column(name = "fullname" , columnDefinition = "nvarchar(50)")
    private String fullname;
    
    @Column(name = "address" , columnDefinition = "nvarchar(150)")
    private String Address;
    
    @Column(name = "email")
    private String Email;
    
    @Column(name = "numberPhone")
    private String NumberPhone;
    
    @OneToOne
    @JoinColumn(name = "user_account")
    UserAccount UserAcc;
    
    @OneToMany(mappedBy = "UserInf")
    List<Bill> Bills;

}
