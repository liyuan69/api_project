
package com.mycompany.onlinebank.services;

import com.mycompany.onlinebank.databases.Database;
import com.mycompany.onlinebank.model.Account;
import com.mycompany.onlinebank.model.Transaction;
import java.util.List;

/**
 *
 * @author liyuanzhang
 * 
 * two methods: 
 * One retrieves ALL ​transactions​ for 
 * a specific ​accountID​ and an other that retrieves a 
 * specific transaction given a​ transID​
 * for a specific​ accID.​ 
 * 
 */
public class TransactionService {
    
    private List<Account> accList= new Database().getAccountDB();
    private List<Transaction> transList = new Database().getTransDB();
    
    // get all transactions list
    public List<Transaction> getAllTransaction(){
        return transList;
    }
    
    public List<Transaction>getAllTransactionsByAccount(int accID){
        return accList.get(accID-1).getTranactions();
    }
    
    public Transaction getTranactionByID(int transId){
        return transList.get(transId-1);
    }
        
}

