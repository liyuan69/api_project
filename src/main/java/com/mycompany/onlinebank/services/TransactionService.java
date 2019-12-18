
package com.mycompany.onlinebank.services;

import com.mycompany.onlinebank.database.Database;
import com.mycompany.onlinebank.model.Account;
import com.mycompany.onlinebank.model.Transaction;
import java.util.List;

/**
 *
 * @author liyuanzhang
 * 
 * methods: 
 * 1.retrieves ALL ​transactions​ for a specific ​accountID​
 * 2.retrieves a specific transaction given a​ transID​ for a specific​ accID.​ 
 * 3.create new transaction
 * 4.transfer from one account to another account
 * 5.lodge/deposit
 * 6.withdrawal
 */
public class TransactionService {
    
    Database b =new Database();
    private List<Account> accList= b.getAccountDB();
    private List<Transaction> transList = b.getTransDB();
    
    
    public Transaction createNewTransaction(int accId,Transaction trans){
        
        //step1:set new Transaction by calling method from transaction model
        trans.setTransId(transList.size()+1);
        //step2: append new transaction to translist database
        transList.add(trans);
        //step3: update the account balance by calling method from account model
        accList.get(accId-1).setCurBal(trans.getPostBalance());
        //step4: append new transaction to account 
        accList.get(accId-1).getTranactions().add(trans);
        return trans;
    }
    
    public Transaction withdrawal(int accId, double amount){
        
        //step1: current balance of current account - withdrawal amount = newBalance
        double postBalance = accList.get(accId-1).getCurBal()-amount;
        //step2: update current newBalance on withdrawal database(with transAction:debit and transType:withdrawal)
        Transaction withdrawal1 = new Transaction(1,"debit","withdrawal" + amount,postBalance);
        //step3: invoking createNewTransaction() method to update new transaction history
        return createNewTransaction(accId,withdrawal1);
    }
    
    public Transaction deposit(int accId,double amount){
        
        //same as withdrawal
        double postBalance =accList.get(accId-1).getCurBal()+amount;
        Transaction deposit1 = new Transaction(1,"credit","deposit" + amount,postBalance);
        return createNewTransaction(accId,deposit1);        
    }
    

    public Transaction transfer(int fromAccId, int toAccId, double amount){
        
        double fromAccNewBal = accList.get(fromAccId-1).getCurBal() - amount;
        double toAccNewBal = accList.get(toAccId-1).getCurBal() + amount;
        
 
        //update:new transaction of transfer for fromAcc
        //reference from transaction constructor from transaction model
        Transaction transferFrom = new Transaction(1,"debit","transfer"+ amount, fromAccNewBal);
        //update:new transaction of transfer for toAcc 
        Transaction transferTo = new Transaction(1,"credit","receive"+ amount, toAccNewBal);
        //invoke createNewTransaction() method to update both account: fromAcc and toAcc
        createNewTransaction(toAccId,transferTo);
        return createNewTransaction(fromAccId, transferFrom);    
    }
 
//    // get all transactions list by customer id
//    public Transaction getAllTransactions(int userId){
//        return transList.get(userId-1);
//    }
    
    public Transaction getTransactionsByAccountId(int accId){
        return transList.get(accId);
    }
    
//    public Transaction getTranactionByTransID(int transId){
//        return transList.get(transId);
//    }

  
        
}

