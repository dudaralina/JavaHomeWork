package com.pb.dudar.hw5;


public class Library {
    public static void main(String[] args) {
        Book[] Books = new Book[3];
        Books[0] = new Book("Приключения", "Иванов И. И.", 2000);
        Books[1] = new Book("Словарь", "Сидоров А. В. ", 1980);
        Books[2] = new Book("Энциклопедия", "Гусев К. В.", 2010);

        Reader[] Readers = new Reader[3];
        Readers [0] = new Reader("Дударь А. А.", "1", "АО", "10.03.1995", "+380672040027");
        Readers [1] = new Reader("Панченко И. А.", "2", "ОА", "02.03.1993", "+380670000000");
        Readers [2] = new Reader("Козина О. Л.", "3", "ПО", "14.12.1999", "+380675050525");


        System.out.println("Книги:");
        for (int i = 0; i < Books.length; i++) {
            System.out.println(Books[i].getInfo());
        }
        System.out.println("\n");
        System.out.println("Читатели:");
        for (int i = 0; i < Readers.length; i++){
            System.out.println(Readers[i].getInfo());
        }

        System.out.println("\n");
        Readers[0].takeBook(3);
        Readers[0].takeBook(Books[2].getName(),Books[0].getName(),Books[1].getName());         System.out.print("\n");
        Readers[0].takeBook(Books[0],Books[1],Books[2]);

        System.out.println("\n");
        Readers[0].returnBook(3);
        Readers[0].returnBook(Books[2].getName(),Books[0].getName(),Books[1].getName());       System.out.print("\n");
        Readers[0].returnBook(Books[0],Books[1],Books[2]);


    }
}
