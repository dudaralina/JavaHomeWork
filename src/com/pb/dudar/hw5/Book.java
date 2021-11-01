package com.pb.dudar.hw5;

public class Book {
    private String name;
    private String author;
    private int year;

    private static final int count = 0;
    public static int getCount(){
        return count;
    }

    public Book(){

    }

    public Book (String name, String author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public String getAuthor() {return author;}
    public void setAuthor(String author) {this.author = author;}

    public int getYear() {return year;}
    public void setYear(int year) {this.year = year;}

        String getInfo(){
        return name + ",  (" + author + ",  " + year + ")";
        }
}
