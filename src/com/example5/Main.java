package com.example5;

public class Main {
    public static void main(String[] args) {
        Date d = new Date(30,12,2020);
        System.out.println(d.toString());
        d.addADay();
        System.out.println(d.toString());
    }
}
