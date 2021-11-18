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
        //int num = 87495;
        int num = scanner.nextInt();
        MapChars mapChars = new MapChars();

        if (num == 0) {
            char[][] chars = mapChars.map2.get(num);
            for (int i = 0; i < 5; i++) {
                System.out.print(chars[i]);
                System.out.println(" ");
            }
        } else {
            List<Integer> listNumbers = new ArrayList<>();
            int count = 0;
            int count3 = 0;
            int num3 = 0;
            while (num != 0) {
                int num2 = num % 10;
                listNumbers.add(count, num2);
                if (num2 >= num3) {
                    num3 = num2;
                     count3 = count;
                }
                num /= 10;
                count++;
            }
            int count2 = 0;
            for (int i = 0; i < 5; i++) {
                for (int j = count - 1; j != -1; j--) {

                        if (j ==count3){
                            char[][] chars = mapChars.map2.get(listNumbers.get(j));
                            System.out.print(chars[count2]);
                        }
                        else {
                            char[][] chars = mapChars.map.get(listNumbers.get(j));
                            System.out.print(chars[count2]);
                        }

                        System.out.print("  ");
                }
                count2++;
                System.out.println();
            }
        }
    }
}
