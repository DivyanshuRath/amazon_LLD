package com.amazonLLD.amazon_LLD.controller;

import com.amazonLLD.amazon_LLD.dto.AccountRequest;
import com.amazonLLD.amazon_LLD.entity.Account;
import com.amazonLLD.amazon_LLD.service.EkHiServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EkHiController {

    @Autowired
    EkHiServiceImpl ekHiServiceImpl;

    @PostMapping("/addAccount")
    public Account addAccount(@RequestBody AccountRequest accountRequest){
        return ekHiServiceImpl.addAccount(accountRequest);
    }

    @GetMapping("/getAccount")
    public AccountRequest getAccount(@RequestParam(name = "id") Integer Id){
        return ekHiServiceImpl.getAccount(Id);
    }

    @DeleteMapping("/deleteAccount")
    public void deleteAccount(@RequestParam(name = "id") Integer Id){
        ekHiServiceImpl.deleteAccount(Id);
    }

}
