package com.amazonLLD.amazon_LLD.repository;

import com.amazonLLD.amazon_LLD.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EkHiRepo extends JpaRepository<Account,Integer> {
}
