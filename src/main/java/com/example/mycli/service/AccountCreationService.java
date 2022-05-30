package com.example.mycli.service;

import com.example.mycli.entity.AccountType;

public interface AccountCreationService {
    void create(String accountType, long bankID, String clientID, long accountID);
}
