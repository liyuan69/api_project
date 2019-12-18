
package com.mycompany.onlinebank.services;

import com.mycompany.onlinebank.database.Database;
import com.mycompany.onlinebank.model.Account;
import com.mycompany.onlinebank.model.Transaction;
import java.util.ArrayList;
import java.util.List;


public class AccountService {
    
    Database d = new Database();
 
    private List<Account> accList = d.getAccountDB();
    private List<Transaction> transList = d.getTransDB();
    
    
    // get current balance
    public double getCurBal(int accId){
    return accList.get(accId).getCurBal();
    }
    
    
    // get all account list by userID
    public Account getAllAccounts(int userId){
        return accList.get(userId);
    }
   
    // get specific account by given accId
    public Account getAccountById(int accId){
        return accList.get(accId-1);
        }
    
      public void addAccount(Account acc){
          accList.add(acc);
      }
      
//    public Account createNewAccount(int userId, Account acc){
//        //set new account
//        acc.setAccId(accList.size()+1);
//        // append new acc to acclist in database
//        accList.add(acc);
//        // update new account current balance under current user id
//        accList.get(userId-1).setCurBal(acc.getCurBal());
//        // append new acc to the user 
//        accList.get(userId-1).getAccounts().add(acc);
//        return acc;
//        }
    

   
}