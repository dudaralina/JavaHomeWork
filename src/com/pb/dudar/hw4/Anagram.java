package com.pb.dudar.hw4;

    import java.util.Scanner;
    import java.util.Arrays;


public class Anagram {

     public static void anagram(String a, String b) {

         a = a.toLowerCase();
         b = b.toLowerCase();

    //создаю массив состоящий из символов строки а и строки b:
        char[] array1 = a.toCharArray();
        char[] array2 = b.toCharArray();

        //сортирую массивы array1 и array2:
        Arrays.sort(array1);
        Arrays.sort(array2);

        //перевожу массивы в строки, удаляю пробелы и символы
        String a1 = new String(array1).replaceAll("\\p{Punct}|\\s","");
        String b1 = new String(array2).replaceAll("\\p{Punct}|\\s","");

        //сравниваю строки
        if (a1.equalsIgnoreCase(b1)) {
            System.out.println("Это анаграмма");
        } else {
            System.out.println("Это не анаграмма");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите текст:");
        String a = scan.nextLine();
        System.out.println("Введите текст:");
        String b = scan.nextLine();

        anagram(a, b);
        }

    }



