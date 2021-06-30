package com.example3;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Harry Potter","Alguien","Editorial1");
        Book book2 = new Book("Harry Potter 1","Alguien","Editorial1");
        Book book3 = new Book("Harry Potter 2","Alguien","Editorial1");
        Book book4 = new Book("Harry Potter 3","Alguien","Editorial1");
        book.borrow();
        System.out.println(book.toString());
        System.out.println(book2.toString());
        System.out.println(book3.toString());
        System.out.println(book4.toString());
        book2.returnBook();

    }


}
