package com.company;

public class Main {

    public static void main(String[] args) {
        CurrentAccount accountA = new CurrentAccount("Alvaro Fuentes",5000.0);
        CurrentAccount accountB = new CurrentAccount("Francisco ---",1000.0);
        CurrentAccount accountC = new CurrentAccount("Francisco ---",8000.0);
        CurrentAccount accountD = new CurrentAccount("Francisco ---",20000.0);
        CurrentAccount accountE = new CurrentAccount("Francisco ---",100000);
        CurrentAccount accountF = new CurrentAccount("Francisco ---",500);

        TransactionService.transfer(accountA,accountB,1000);
        TransactionService.transfer(accountE,accountF,50000);
        TransactionService.printTransactions();

    }
}
