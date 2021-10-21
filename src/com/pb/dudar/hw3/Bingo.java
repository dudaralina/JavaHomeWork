package com.pb.dudar.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random guess = new Random();
        int x = guess.nextInt(101); // задуманное рандомное число от 0 до 100 включительно

        System.out.println("Угадай какое число я загадала от 0 до 100 :)");
        System.out.println("Если введешь число, что не входит в промежуток от 0 до 100, игра закончится");

        for (int counter = 1; ; counter++) {
            System.out.println("Попытка №" + counter);
            int attempt = in.nextInt();
            //String str = Integer.toString(attempt);
            //if (str.equals("end")) {break;}
            if ((attempt < 0) || (attempt > 100)) {
                break;
            }
            if (attempt != x) {
                if (x > attempt) {
                    System.out.println("бери выше!");
                }
                if (x < attempt) {
                    System.out.println("моё число меньше");
                }
                continue;
            }
           System.out.println("Bingo! Ты угадал с " + counter + " попытки");
                break;
        }
        System.out.println("Конец игры");
    }
}
