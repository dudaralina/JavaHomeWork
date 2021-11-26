package com.pb.dudar.hw10;

public class NumBox <T extends Number> {
    public T[] numbers;
    int length;

    public NumBox(int length) {
        numbers = (T[]) new Number[length];
        this.length = length;
    }

    public void add (int index, T num) {
     try {
        if (numbers.length <= length) {
            this.numbers[index] = num;
        }
     } catch (Exception e) {
         System.out.println("Превышена длина массива! " + e.getMessage() + "-й элемент не может быть записан! Максимальная длина " + length + " элемента");
     }
    }

    public T get(int index) {
        return numbers[index];
    }

    public int length() {
        int count = 0;
        for (T number : numbers) {
            if (number != null) {
                count++;
            }
        }
        return count;
    }

    public double average() {
        return sum() / length();
    }

    public double sum () {
        double sum = 0;
        for (T i : numbers) {
            if (i != null) {
                sum += i.doubleValue();
            }
        }
            return sum;
    }

    public T max (){
        T max = numbers[0];
        for (T i : numbers) {
            if (i != null) {
                if (i.doubleValue() > max.doubleValue()) {
                    max = i;
                }
            }
        }
        return max;
    }

}
