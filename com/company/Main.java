package com.company;

import java.util.Scanner;

//Напишите программу, которая возвращает сумму цифр, присутствующих в данной строке. Если цифр нет, то возвращаемая
// сумма должна быть равна 0.
class Main {

    public static void main(String[] args) {
        try {
            int sum = 0;
            Scanner scanner = new Scanner(System.in);
            String num = scanner.nextLine();
            if (!num.isEmpty()) {
                int number = Integer.parseInt(num);
                while (number != 0) {
                    int number2 = number % 10;
                    sum = sum + number2;
                    number = number / 10;
                }
            }
            System.out.println(sum);
        } catch (NumberFormatException e) {
            System.out.println("Не верный формат числа ");
        }
    }
}

