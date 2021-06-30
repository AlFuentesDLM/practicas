package com.example2;

public class Example2 {
    public static void main(String[] args) {
        Contador cont = new Contador(1);
        cont.increment();
        cont.increment();
        System.out.println(cont.getValue());
        cont.decrement();
        System.out.println(cont.getValue());
    }
}
