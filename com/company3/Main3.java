package com.company3;

import java.util.*;

//Создайте программу, которая будет:
//подсчитывать количество гласных в словах
//выводить слова отсортированным списком по количеству гласных (сначала те, у которых больше гласных)
//делать первую гласную букву в слове заглавной
//Предложение вводится пользователем вручную русскими буквами. Разделитель пробел (“ ”).
public class Main3 {


    public static void main(String[] args) {

        TreeMap<String, Integer> map = new TreeMap<>();

        Scanner scanner = new Scanner(System.in);
        //String[] offer = scanner.nextLine().split(" ");
        String[] offer = "я не сошёл с ума".split(" ");
        //System.out.println(Arrays.toString(offer));

        for (String word : offer) {
            int count = 0;
            for (int j = 0; j < word.length(); j++) {
                char chr = word.charAt(j);
                if (isWovel(chr)) {
                    if (count == 0) {
                        String d = String.valueOf(chr).substring(0, 1).toUpperCase();
                        System.out.print(d.charAt(0));
                    } else System.out.print(chr);
                    count++;
                } else System.out.print(chr);
            }
            System.out.print(" ");
            map.put(word, count);
        }
        System.out.println();
        map.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);
    }

    public static boolean isWovel(char c) {
        return "АЕЁИОУЫЭЮЯаеёиоуыэюя".indexOf(c) != -1;
    }
}

