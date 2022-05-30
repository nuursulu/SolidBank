package com.example.mycli.service;

import com.example.mycli.entity.Account;
import com.example.mycli.entity.AccountType;
import com.example.mycli.entity.AccountWithdraw;

import java.util.List;

public interface AccountListingService {

    Account getClientAccount(String clientID, String accountID);
    AccountWithdraw getClientWithdrawAccount(String clientID, String accountID);
    List<Account> getClientAccounts(String clientID);
    List<Account> getClientAccountsByType(String clientID, String accountType);
}
