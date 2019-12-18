/*
 * Databases to hold all in-memory “mock” 
 * database structures 
 * and remove the stubs from the current java classes 
 * 
 */
package com.mycompany.onlinebank.database;

import com.mycompany.onlinebank.model.Account;
import com.mycompany.onlinebank.model.Transaction;
import com.mycompany.onlinebank.model.User;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author liyuanzhang
 */
public class Database {
    

    //this is user database to store all users
    public static List<User> userDB = new ArrayList<>();
    
    //this is account database to record all accounts
    public static List<Account> accountDB = new ArrayList<>();
    
    //this is transaction database to record all transations
    public static List<Transaction> transDB = new ArrayList<>();
    
    
    
    public static boolean init = true; 
    
    public Database(){
        
    
           
//           //create some user
//           User user1 = new User(2, "Enda", "dublin12", "en@gmail.com","1234",accountDB);
//           User user2 = new User(3, "Liam", "dublin24", "li@gmail.com","4567",accountDB);
           
//           userDB.add(user1);
//           userDB.add(user2);
//  
//        this.transId = transId;
//        this.transType = transType;
//        this.desc = desc;
//        this.postBalance = postBalance;
            
           //create some transactions
            
           Transaction t1 = new Transaction(3,"credit","saving",400.0);
           Transaction t2 = new Transaction(4,"debit","food",50.16);
           //Transaction t3 = new Transaction(3,"debit","withdrawal",100);
           //Transaction t4 = new Transaction(4,"debit","withdrawal",100);
           
           transDB.add(t1);
           //transDB.add(t2);
           //transDB.add(t3);
           //transDB.add(t4);
           
           // add those transactions to each of the aacount
           // all account will contain same list of seeded transactions
           
           Account acc1 = new Account(2,"AIBCK123",001,1400.0,transDB);
           Account acc2 = new Account(3,"AIBCK456",002,350.0,transDB);
           //Account acc3 = new Account(3,"363",656,12,transDB);
           //Account acc4 = new Account(4,"364",9,10,transDB);
           
           accountDB.add(acc1);
           accountDB.add(acc2);
           //accountDB.add(acc3);
           //accountDB.add(acc4);   
           
           
        
    }
    
    //a method that retrieves all accounts from the DB layer 
    //This method will only return the new 
    //list variable that just renamed ​accountDB​ which 
    //currently contains all “seeded” account 
    public static List<Account> getAccountDB(){
        return accountDB;
    }
    
    public static List<Transaction> getTransDB(){
        return transDB;
    }
    
    public static List<User> getUserDB(){
        return userDB;
    
    }
    
}
