package com.amazonLLD.amazon_LLD.service;

import com.amazonLLD.amazon_LLD.dto.AccountRequest;
import com.amazonLLD.amazon_LLD.entity.Account;
import com.amazonLLD.amazon_LLD.repository.EkHiRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EkHiServiceImpl implements EkHiService{

    @Autowired
    EkHiRepo ekHiRepo;

    public Account addAccount(AccountRequest accountRequest) {

    }

    @Override
    public void deleteAccount(int accountID) {

    }

    @Override
    public Account getAccount(int accountID) {
        return null;
    }
}
