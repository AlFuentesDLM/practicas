package com.example3;

public class Book implements State {
    private String editorial;
    private String state;
    private String name;
    private String author;

    public Book(String name, String author, String editorial) {
        this.author = author;
        this.name = name;
        this.editorial = editorial;
        this.state = available;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }


    public void borrow() {
        this.state = borrow;
    }

    public void returnBook() {
        if (this.state == available){
            throw new Error("This book is already available");
        }else{
            this.state = available;
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "editorial='" + editorial + '\'' +
                ", state='" + state + '\'' +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
