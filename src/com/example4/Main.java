package com.example4;

public class Main {
    public static void main(String[] args) {
        Fraction fraction = new Fraction(5,8);
        Fraction fraction1 = new Fraction(1,7);
        fraction.addition(fraction1);
        fraction.subtraction(fraction1);
        fraction.multiplication(fraction1);
        fraction.division(fraction1);
    }

}
