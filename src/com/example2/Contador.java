package com.example2;

public class Contador {
    private int value;
    public Contador(){
        this.value = 0;
    }

    public Contador(int initialValue){
        this.value = initialValue;
    }

    public Contador(Contador contador){
        this.value = contador.getValue();
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void increment(){
        this.value+=1;
    }
    public void decrement(){
        this.value-=1;
    }
}
