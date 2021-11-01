package com.pb.dudar.hw5;

public class Reader {
    private String fullName;
    private String numberReader;
    private String fak;
    private String dateOfBirth;
    private String phone;

    public Reader() {

    }

        public Reader (String fullName, String numberReader, String fak, String dateOfBirth, String phone ) {
        this.fullName = fullName;
        this.numberReader = numberReader;
        this.fak = fak;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
    }

    String getInfo(){
        return "№ " + numberReader + " " + fullName +  "\nфакультет: [" + fak + "] дата рождения: [" + dateOfBirth + "] номер телефона: [" + phone + "]";
    }

    private static final int count = 0;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getNumberReader() {
        return numberReader;
    }

    public void setNumberReader(String numberReader) {
        this.numberReader = numberReader;
    }

    public String getFak() {
        return fak;
    }

    public void setFak(String fak) {
        this.fak = fak;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void takeBook(int how) {
        System.out.println(fullName + " взял " + how + " книги");
    }

    public void takeBook(String... books) {
        System.out.print(fullName + " взял книги: ");
        for (String name : books) {
            System.out.print(name + "; ");
        }
    }


    public void takeBook (Book... books) {
         System.out.println(fullName + " взял книги: ");
         for (Book book : books){
             System.out.println(book);
            }
        }

    public void returnBook(int how) {
        System.out.println(fullName + " вернул " + how + " книги");
    }

    public void returnBook(String... books) {
        System.out.print(fullName + " вернул книги: ");
        for (String name : books) {
            System.out.print(name + "; ");
        }
    }
    public void returnBook (Book... books) {
        System.out.print(fullName + " вернул книги: ");
        for (Book book : books){
            System.out.print(book);
        }
    }



    }

