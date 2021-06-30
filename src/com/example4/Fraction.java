package com.example4;

public class Fraction {
    private int numerator;
    private int dominator;

    public Fraction(int numerator, int dominator){
        if (dominator == 0){
            throw new Error("Dominator cant be 0");
        }else{
            this.numerator = numerator;
            this.dominator = dominator;
        }
    }

    @Override
    public String toString() {
        return numerator+"/"+dominator;
    }

    public void addition(Fraction fraction){
        int numerator;
        int dominator;
        if (this.dominator == fraction.dominator){
            numerator = (this.numerator) + (fraction.numerator);
            dominator = this.dominator;
        }else{
            numerator = (this.numerator * fraction.dominator) + (fraction.numerator * this.dominator);
            dominator = this.dominator * fraction.dominator;
        }
        System.out.println(numerator+"/"+dominator);

    }

    public void subtraction(Fraction fraction){
        int numerator;
        int dominator;
        if (this.dominator == fraction.dominator){
             numerator =  (this.numerator ) - (fraction.numerator);
             dominator = this.dominator;
        }else{
             numerator =  (this.numerator * fraction.dominator) - (fraction.numerator * this.dominator);
             dominator = this.dominator * fraction.dominator;
        }
        System.out.println(numerator+"/"+dominator);


    }

    public void multiplication(Fraction fraction){
        int numerator = this.numerator * fraction.numerator;
        int dominator = this.dominator * fraction.dominator;
        System.out.println(numerator+"/"+dominator);
    }

    public void division(Fraction fraction){
        int numerator = this.numerator * fraction.dominator;
        int dominator = this.dominator * fraction.numerator;
        System.out.println(numerator+"/"+dominator);
    }
}
