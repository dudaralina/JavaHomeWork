package com.pb.dudar.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число: ");

        int number = in.nextInt();
            if (number >= 0 && number <= 14) {
                System.out.println("Ваше число из промежутка  [0 -14]");
            } else if (number >= 15 && number <= 35) {
                System.out.println("Ваше число из промежутка  [15 -35]");
            } else if (number >= 36 && number <= 50) {
                System.out.println("Ваше число из промежутка  [36 -50]");
            } else if (number >= 51 && number <= 100) {
                System.out.println("Ваше число из промежутка  [51 -100]");
            } else {
                System.out.println("Ваше число не входит ни в один из промежутков [0 -14] [15 - 35] [36 - 50] [51 - 100]");
            }
        }
    }
