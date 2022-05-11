package com.example.mycli;

import com.example.mycli.DAO.MemoryAccountDAO;
import com.example.mycli.entity.Account;
import com.example.mycli.entity.AccountType;
import com.example.mycli.service.AccountListingService;

public class AccountBasicCLI {
    private CreateAccountOperationUI createAccountOperationUI;
    private BankCore bankCore;
    private AccountListingService accountListing;


    public AccountBasicCLI(CreateAccountOperationUI createAccountOperationUI, BankCore bankCore, AccountListingService accountListing) {
        this.createAccountOperationUI = createAccountOperationUI;
        this.bankCore = bankCore;
        this.accountListing = accountListing;
    }



    public void createAccountRequest(String clientID){
        bankCore.createNewAccount(createAccountOperationUI.requestAccountType(), clientID);

    }
    public void getAccounts(String clientID){
        System.out.println(accountListing.getClientAccounts(clientID));
    }
}
