package com.example.mycli.DAO;

import com.example.mycli.entity.*;
import java.util.*;

public class MemoryAccountDAO implements AccountDAO {
    private List<Account> accountList = new ArrayList<>();;

    @Override
    public List<Account> getClientAccounts(String clientID) {
        return this.accountList;
    }

    @Override
    public void createNewAccount(Account account) {
        this.accountList.add(account);
    }

    @Override
    public void updateAccount(Account account) {
        this.accountList.add(account);
    }

    @Override
    public List<Account> getClientAccountsByType(String clientID, AccountType accountType) {
        List<Account> clientAccountsByTypeList = null;
        for (Account account : accountList) {
            if (account.getAccountType().equals(accountType) && account.getClientID().equals(clientID)) {
                clientAccountsByTypeList.add(account);
            }
        }
        if(clientAccountsByTypeList== null){
            return clientAccountsByTypeList;
        }
        else return null;

    }

    @Override
    public AccountWithdraw getClientWithdrawAccount(String clientID, String accountID) {

        for (Account temp : accountList) {
            if (temp.getId().equals(accountID) && temp.getClientID().equals(clientID)) {
                return (AccountWithdraw) temp;
            }
        }
        return null;
    }

    @Override
    public Account getClientAccount(String clientID, String accountID) {
        for (Account account : accountList) {
            if (account.getId().equals(accountID) && account.getClientID().equals(clientID)) {
                return account;
            }
        }
        return null;
    }
}
