package com.pb.dudar.hw4;


import java.util.Scanner;

public class CapitalLetter {


    public static void main(String[] args) {
        String a;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите текст:");
        a = scan.nextLine();
        upper(a);
    }

    public static void upper(String a) {
        String[] ololo = a.split(" ");
        for (int i = 0; i < ololo.length; i++) {
            ololo[i] = ololo[i].substring(0,1).toUpperCase() + ololo[i].substring(1).toLowerCase();
            System.out.print(ololo[i] + " ");
        }
    }
}





