package com.company;

import java.util.UUID;

public class Transaction {
    private String transactionId;
    private String accountIdFrom;
    private String accountIdTo;
    private double transactionMoney;
    public Transaction(String accountIdFrom,String accountIdTo,double transactionMoney){
        UUID uuid = UUID.randomUUID();
        this.transactionId = uuid.toString();
        this.accountIdFrom = accountIdFrom;
        this.accountIdTo = accountIdTo;
        this.transactionMoney = transactionMoney;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getAccountIdFrom() {
        return accountIdFrom;
    }

    public void setAccountIdFrom(String accountIdFrom) {
        this.accountIdFrom = accountIdFrom;
    }

    public String getAccountIdTo() {
        return accountIdTo;
    }

    public void setAccountIdTo(String accountIdTo) {
        this.accountIdTo = accountIdTo;
    }

    public double getTransactionMoney() {
        return transactionMoney;
    }

    public void setTransactionMoney(double transactionMoney) {
        this.transactionMoney = transactionMoney;
    }
}
