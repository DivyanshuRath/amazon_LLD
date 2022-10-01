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
        Account account = new Account();
        account.setAddress(accountRequest.getAddress());
        account.setEmailID(accountRequest.getEmailID());
        account.setPhoneNumber(accountRequest.getPhoneNumber());
        account.setPassword(accountRequest.getPassword());
        account.setUserName(accountRequest.getUserName());
        account.setAccountStatus(accountRequest.getAccountStatus());
        return ekHiRepo.save(account);
    }

    @Override
    public void deleteAccount(int accountID) {
        ekHiRepo.deleteById(accountID);
    }

    @Override
    public AccountRequest getAccount(int accountID) {
        AccountRequest accountRequest = new AccountRequest();
        Account account = ekHiRepo.findById(accountID).get();
        accountRequest.setUserName(account.getUserName());
        accountRequest.setAddress(account.getAddress());
        accountRequest.setPassword(account.getPassword());
        accountRequest.setEmailID(account.getEmailID());
        accountRequest.setPhoneNumber(account.getPhoneNumber());
        accountRequest.setAccountStatus(account.getAccountStatus());

        return accountRequest;
    }
}
