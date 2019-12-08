
package com.mycompany.onlinebank.services;

import com.mycompany.onlinebank.databases.Database;
import com.mycompany.onlinebank.model.Account;
import java.util.ArrayList;
import java.util.List;


public class AccountService {
    
    Database d = new Database();
    private List<Account> list = d.getAccountDB();
    

    
    // get all account list
    public List<Account> getAllAccount(){
        return list;
    }
   
    // get specific account by given accId
    public Account getAccount(int accId){
        return list.get(accId-1);
    }
    
    // search matches account(list) by given sortCode anf accNum
    public List<Account> getSearchAccount(int sortCode,int accNum){
        List<Account> matchesList = new ArrayList<>();
        
        for(Account m: getAllAccount()){
            if(m.getSortCode()== sortCode && m.getAccNum()==accNum ){
                matchesList.add(m);
            }    
        } 
        return matchesList;
    }
}
