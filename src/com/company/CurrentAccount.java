package com.company;

import java.util.ArrayList;
import java.util.UUID;

public class CurrentAccount {
    private String accountId;
    private String accountName;
    private double balance;

    public  CurrentAccount(String accountName,double balance){
        UUID uuid = UUID.randomUUID();
        this.accountId = uuid.toString();
        this.accountName = accountName;
        this.balance = balance;

    }
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountId(){
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void income(double money){
        this.balance +=money;
    }

    public void egress(double money){
        this.balance -=money;
    }

    public void refund(double money,CurrentAccount refundAccount){
        this.balance -=money;
        refundAccount.income(money);
    }



}
