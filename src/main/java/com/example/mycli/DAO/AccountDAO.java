package com.example.mycli.DAO;

import com.example.mycli.entity.*;

import java.util.List;

public interface AccountDAO {
    public List<Account> getClientAccounts(String clientID);
    void createNewAccount(Account account);
    void updateAccount(Account account);
    public List<Account> getClientAccountsByType(String clientID, AccountType accountType);
    AccountWithdraw getClientWithdrawAccount(String clientID, String accountID);
    Account getClientAccount(String clientID, String accountID);

}
