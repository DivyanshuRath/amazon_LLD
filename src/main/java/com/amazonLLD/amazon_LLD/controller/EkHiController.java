package com.amazonLLD.amazon_LLD.controller;

import com.amazonLLD.amazon_LLD.dto.AccountRequest;
import com.amazonLLD.amazon_LLD.entity.Account;
import com.amazonLLD.amazon_LLD.service.EkHiServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EkHiController {

    @Autowired
    EkHiServiceImpl ekHiServiceImpl;

    @PostMapping("/addAccount")
    public Account addAccount(AccountRequest accountRequest){
        return ekHiServiceImpl.addAccount(accountRequest);
    }
}
