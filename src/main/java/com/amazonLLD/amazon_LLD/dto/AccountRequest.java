package com.amazonLLD.amazon_LLD.dto;

import com.amazonLLD.amazon_LLD.enumration.AccountStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountRequest {
    private String userName;
    private String password;
    private String address;
    private String emailID;
    private String phoneNumber;
    private AccountStatus accountStatus;
}
