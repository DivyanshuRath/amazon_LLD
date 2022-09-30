package com.amazonLLD.amazon_LLD.service;

import com.amazonLLD.amazon_LLD.dto.AccountRequest;
import com.amazonLLD.amazon_LLD.entity.Account;

public interface EkHiService {
    Account addAccount(AccountRequest accountRequest);
    void deleteAccount(int accountID);
    Account getAccount(int accountID);
}
