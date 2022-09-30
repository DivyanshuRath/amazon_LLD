package com.amazonLLD.amazon_LLD.entity;

import com.amazonLLD.amazon_LLD.enumration.AccountStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer accountID;
    private String userName;
    private String password;
    AccountStatus accountStatus;
    private String address;
    private String emailID;
    private String phoneNumber;

}
