package com.pb.dudar.hw5;

public class Reader {
    private String fullName;
    private String numberReader;
    private String fak;
    private String dateOfBirth;
    private String phone;


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
         System.out.print(fullName + " взял книги: ");
         for (Book book : books){
             System.out.print(book.getInfo() + "; ");
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
            System.out.print(book.getInfo() + "; ");
        }
    }

}

