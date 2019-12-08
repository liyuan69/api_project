/*
 * Databases to hold all in-memory “mock” 
 * database structures 
 * and remove the stubs from the current java classes 
 * 
 */
package com.mycompany.onlinebank.databases;

import com.mycompany.onlinebank.model.Account;
import com.mycompany.onlinebank.model.Transaction;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author liyuanzhang
 */
public class Database {
    
    
    public static List<Transaction> transDB = new ArrayList<>();
    
    // original from accountService
    public static List<Account> accountDB = new ArrayList<>();
    public static boolean init = true; //init 初始化
    
    //create constructor for transaction

    
  
    
    // create constructor for account
    public Database(){
        
        // original from accountService--> inside of 
        // accountService constructor(now have been deleted)
        
        if(init){
            
            //create some transactions
           Transaction t1 = new Transaction(1,"first Transaction");
           Transaction t2 = new Transaction(2,"second Transaction");
           Transaction t3 = new Transaction(3,"third Transaction");
           Transaction t4 = new Transaction(4,"fourth Transaction");
           
           transDB.add(t1);
           transDB.add(t2);
           transDB.add(t3);
           transDB.add(t4);
           
           // add those transactions to each of the aacount
           // all account will contain same list of seeded transactions
           
           Account acc1 = new Account(1,361,471,45,transDB);
           Account acc2 = new Account(2,362,567,34,transDB);
           Account acc3 = new Account(3,363,656,12,transDB);
           Account acc4 = new Account(4,364,9,10,transDB);
           
           accountDB.add(acc1);
           accountDB.add(acc2);
           accountDB.add(acc3);
           accountDB.add(acc4);   
           
        }   
        
    }
    
    //a method that retrieves all messages from the DB layer 
    //This method will only return the new 
    //list variable we just renamed ​messageDB​ which 
    //currently contains all “seeded” messages 
    public static List<Account> getAccountDB(){
        return accountDB;
    }
    
    public static List<Transaction> getTransDB(){
        return transDB;
    }
    
    
}
