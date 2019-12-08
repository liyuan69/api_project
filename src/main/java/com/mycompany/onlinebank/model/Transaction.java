
package com.mycompany.onlinebank.model;

import java.util.Date;

/**
 *
 * @author liyuanzhang
 */
public class Transaction {
    
    private int transId;
    private String trans;
    //private Date TransCreated;
    

    public Transaction() {
        
    }

    public Transaction(int transId,String trans) {
        this.transId = transId;
        this.trans = trans;
    }
    

   

    public int getTransId() {
        return transId;
    }

    public void setTransId(int transId) {
        this.transId = transId;
    }
    
    

//    public Date getTransCreated() {
//        return TransCreated;
//    }
//
//    public void setTransCreated(Date TransCreated) {
//        this.TransCreated = TransCreated;
//    }

    public String getTrans() {
        return trans;
    }

    public void setTrans(String trans) {
        this.trans = trans;
    }

    
    
    

      
    
    
    
    
    
}
