
package com.mycompany.onlinebank.model;

import java.util.List;

/**
 *
 * @author liyuanzhang
 */


public class Account {
    
    private long accId;
    private int sortCode;
    private int accNum;
    private int curBal;
    private List<Transaction> transactions;

    public Account() {
        
    }

    public Account(long accId, int sortCode, int accNum, int curBal,List<Transaction> transactions) {
        this.accId = accId;
        this.sortCode = sortCode;
        this.accNum = accNum;
        this.curBal = curBal;
        this.transactions=transactions;
    }

    public long getAccId() {
        return accId;
    }

    public void setAccId(long accId) {
        this.accId = accId;
    }

    public int getSortCode() {
        return sortCode;
    }

    public void setSortCode(int sortCode) {
        this.sortCode = sortCode;
    }

    public int getAccNum() {
        return accNum;
    }

    public void setAccNum(int accNum) {
        this.accNum = accNum;
    }

    public int getCurBal() {
        return curBal;
    }

    public void setCurBal(int curBal) {
        this.curBal = curBal;
    }

    public List<Transaction> getTranactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }


   
}
