package com.company2;


import java.util.InputMismatchException;
import java.util.Scanner;

//Создайте программу, которая будет вычислять и выводить на экран простые множители, из которых состоит целое число,
// введенное пользователем. Если введенное число не целое, то нужно сообщать пользователю об ошибке.
public class Main2 {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            int count = 2;
            while (num % count == 0) {
                System.out.print(count + " ");
                num = num / count;
            }
            while (num % count != 0) {
                count++;
                while (num % count == 0 && num != count) {
                    num = num / count;
                    System.out.print(count + " ");
                }
            }
            System.out.print(num);
        } catch (InputMismatchException e) {
            System.err.println("Ошибка!!! " +
                    "Введено не целое число ");
        }
    }
}