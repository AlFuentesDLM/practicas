package com.company;

import java.util.ArrayList;

public class TransactionService {
    public static ArrayList<Transaction> transactions = new ArrayList<Transaction>();
    public  static void transfer(CurrentAccount from,CurrentAccount to,double money){
        double balanceFrom = from.getBalance();
        Transaction transaction = new Transaction(from.getAccountId(),to.getAccountId(),money);

        if (balanceFrom > money){
            from.egress(money);
            to.income(money);
            System.out.println("Transaction is okay, current balance from : "+from.getBalance());
            System.out.println("Transaction is okay, current balance to: "+to.getBalance());
            System.out.println("Amount transfer was: "+money);
            transactions.add(transaction);
        }else{
            throw new Error("Not enough money to transfer");
        }
    }

    public static void printTransactions(){
        for (Transaction transaction:
             transactions) {
            System.out.println("---------------------------------------------------------------------------------------");

            System.out.println("From: "+transaction.getAccountIdFrom()+" > to: "+transaction.getTransactionId());
            System.out.println("Transaction with id: "+transaction.getTransactionId()+" for an amount of: $"+transaction.getTransactionMoney());

            System.out.println("---------------------------------------------------------------------------------------");
        }
    }
}
