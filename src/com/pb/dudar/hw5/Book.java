package com.pb.dudar.hw5;

public class Book {
    private String name;
    private String author;
    private int year;


    public Book (String name, String author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public String getName() {return name;}

        String getInfo(){
        return name + ",  (" + author + ",  " + year + ")";
        }
}
