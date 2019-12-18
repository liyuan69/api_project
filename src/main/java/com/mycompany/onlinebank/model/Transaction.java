
package com.mycompany.onlinebank.model;

import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;



/**
 *
 * @author liyuanzhang
 */
@XmlRootElement
public class Transaction {
    
    private int transId;
    //transType include: debit,credit
    private String transType;
    //private Date TransCreated;
    private Date date;
    private String desc;
    private double postBalance;
    
    
 
    public Transaction() {
        
    }

    public Transaction(int transId, String transType, String desc, double postBalance) {
        this.transId = transId;
        this.transType = transType;
        this.desc = desc;
        this.postBalance = postBalance;
    }
    
    
    

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPostBalance() {
        return postBalance;
    }

    public void setPostBalance(double postBalance) {
        this.postBalance = postBalance;
    }

    public int getTransId() {
        return transId;
    }

    public void setTransId(int transId) {
        this.transId = transId;
    }

    public String getTransType() {
        return transType;
    }

    public void setTransType(String transType) {
        this.transType = transType;
    }

    
    
 
      
}
