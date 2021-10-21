package com.pb.dudar.hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array = new int[10];
        int begin = 0;
        int positive;
        int counter = 0;
        System.out.println("заполните массив размерностью 10 элементов целыми числами");
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }


        for (int i = 0; i < array.length; i++) {
            System.out.print("[ " + array[i] + " ]");
        }
        for (int elem : array) {
            begin = begin + elem;
        }
            System.out.print("\n");
            System.out.println("сумма элементов массива = " + begin);
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                counter++;
            }
        }
        System.out.println("количество положительных элементов = " + counter);
        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if (array[i] > array [i+1]) {
                    isSorted = false;

                    buf = array [i];
                    array[i] = array [i+1];
                    array [i+1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
    }
