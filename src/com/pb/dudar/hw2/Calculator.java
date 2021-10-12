package com.pb.dudar.hw2;

import java.util.Objects;
import java.util.Scanner;


public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int operand1;
        int operand2;
        String sign;

        System.out.print("Введите operand1: ");
        operand1 = in.nextInt();

        System.out.print("Введите знак арифметической операции: ");
        sign = in.next();
        if (sign.equals("+") || sign.equals("*") || sign.equals("/") || sign.equals("-")) {
            System.out.print("Введите operand2: ");
            operand2 = in.nextInt();

            switch (sign) {
                case "/":
                    if (operand2 == 0) {
                        System.out.print("ай-я-яй...нельзя так делать!");
                        break;
                    }
                    System.out.println(operand1 + sign + operand2 + "=" + (float) operand1 / operand2);
                    break;
                case "*":
                    System.out.println(operand1 + sign + operand2 + "=" + operand1 * operand2);
                    break;
                case "+":
                    System.out.println(operand1 + sign + operand2 + "=" + (operand1 + operand2));
                    break;
                case "-":
                    System.out.println(operand1 + sign + operand2 + "=" + (operand1 - operand2));
                    break;
            }
        } else {
                System.out.println("Неверный знак!");
            }

            }

        }

