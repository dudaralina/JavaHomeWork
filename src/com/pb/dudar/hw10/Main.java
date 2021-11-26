package com.pb.dudar.hw10;

public class Main {
    public static void main(String[] args) throws Exception {
        NumBox<Integer> a1 = new NumBox<>(3);
        a1.add( 0, 3);
        a1.add(2,12);
        a1.add(6,5);

        System.out.println("Нулевой индекс массива число: " + a1.get(0));
        System.out.println("Количество записаных элементов массива: " + a1.length());
        System.out.println("Сумма элементов массива: " + a1.sum());
        System.out.println("Среднее арифметическое: " + a1.average());
        System.out.println("Максимальное число: " + a1.max());


        System.out.println("__________________________________________________________________________________________" +
                "\n__________________________________________________________________________________________");


        NumBox<Float> a2 = new NumBox<>(3);
        a2.add(0,2.0101f);
        a2.add(2,0.0f);
        a2.add(12,0.0f);

        System.out.println("Нулевой индекс массива а2 число: " + a2.get(0));
        System.out.println("Второй индекс массива а2 число: " + a2.get(2));
        System.out.println("Кол-во записаных элементов массива: " + a2.length());
        System.out.println("Сумма элементов массива: " +  a2.sum());
        System.out.println("Среднее арифметическое: " + a2.average());
        System.out.println("Максимальное число: " + a2.max());

    }
}
