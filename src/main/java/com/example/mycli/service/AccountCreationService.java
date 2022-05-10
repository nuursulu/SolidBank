package com.example.mycli.service;

import com.example.mycli.entity.AccountType;

public interface AccountCreationService {
    public void create(AccountType accountType, long bankID, String clientID, long accountID);
}
