package com.example.mycli.DAO;


import com.example.mycli.entity.*;
import java.util.*;

public class MemoryAccountDAO implements AccountDAO {
    private List<Account> accountList;

    @Override
    public List<Account> getClientAccounts(String clientID) {
        return this.accountList;
    }

    @Override
    public void createNewAccount(Account account) {
        accountList = new ArrayList<>();
        this.accountList.add(account);
    }

    @Override
    public void updateAccount(Account account) {
        this.accountList.add(account);
    }

    @Override
    public List<Account> getClientAccountsByType(String clientID, AccountType accountType) {
        List<Account> getClientAccountsByType;

        return null;
    }

    @Override
    public AccountWithdraw getClientWithdrawAccount(String clientID, String accountID) {

        return null;
    }

    @Override
    public Account getClientAccount(String clientID, String accountID) {

        return null;
    }
}
