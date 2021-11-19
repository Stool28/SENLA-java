package com.company4;

import java.util.*;

//Создайте программу, которая будет получать число и печатать его в следующем формате (формы цифр можно придумать
// свои, главное, чтобы они читались на экране):
//(*) Дополнительно: сделайте так, чтобы наибольшая цифра состояла не из ‘*’, а из соответствующих маленьких (обычных)
// цифр.
public class main4 {

    public static void main(String[] args) {
        System.out.println("Ввидите число и нажмите ENTER: ");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        MapNumbers mapNumbers = new MapNumbers();

        if (number == 0) {
            for (String string : Numbers.number0()) {
                System.out.println(string.replace("*", String.valueOf(0)));
            }
        } else {
            List<Integer> listNumbers = new ArrayList<>();
            int max = 0;
            while (number != 0) {
                int digit = number % 10;
                listNumbers.add(digit);
                if (digit >= max) {
                    max = digit;
                }
                number /= 10;
            }
            Collections.reverse(listNumbers);
            for (int i = 0; i < 5; i++) {
                for (Integer listNumber : listNumbers) {
                    String[] strings = mapNumbers.map.get(listNumber);
                    if (listNumber == max) {
                        System.out.print(strings[i].replace("*", String.valueOf(max)) + " ");
                    } else {
                        System.out.print(strings[i] + "  ");
                    }
                }
                System.out.println();
            }
        }

    }
}
