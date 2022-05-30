package com.example.mycli.delivery;
import com.example.mycli.BankCore;
import com.example.mycli.CLI.CreateAccountOperationUI;
import com.example.mycli.service.AccountListingService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class AccountBasicCLI {
    private CreateAccountOperationUI createAccountOperationUI;
    private BankCore bankCore;
    private AccountListingService accountListing;

    public void createAccountRequest(String clientID){
        bankCore.createNewAccount(createAccountOperationUI.requestAccountType(), clientID);
    }

    public void getAccounts(String clientID){
        System.out.println(accountListing.getClientAccounts(clientID));
    }
}

