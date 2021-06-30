package com.example5;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Date extends GregorianCalendar {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        super();
        set(year, month - 1, day);
        this.day = this.get(Calendar.DAY_OF_MONTH);
        this.month = this.get(Calendar.MONTH)+1;
        this.year = this.get(Calendar.YEAR);
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return formatNumber(day)+"/"+formatNumber(month)+"/"+year;
    }

    private String formatNumber(int number){
        if(number > 9){
            return String.valueOf(number);
        }else{
            return "0"+number;
        }
    }

    public void addADay() {
        set(year, month - 1, day + 1);
    }

}
