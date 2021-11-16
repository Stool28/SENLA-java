package com.company3;

import java.util.*;

//Создайте программу, которая будет:
//подсчитывать количество гласных в словах
//выводить слова отсортированным списком по количеству гласных (сначала те, у которых больше гласных)
//делать первую гласную букву в слове заглавной
//Предложение вводится пользователем вручную русскими буквами. Разделитель пробел (“ ”).
public class Main3 {


    public static void main(String[] args) {

        TreeMap<String, Integer> map = new TreeMap<String, Integer>();

        Scanner scanner = new Scanner(System.in);
        String[] offer = scanner.nextLine().split(" ");
        System.out.println(Arrays.toString(offer));


        for (String word : offer) {
            int count = 0;
            for (int j = 0; j < word.length(); j++) {
                char chr = word.charAt(j);
                if (isWovel(chr)) count++;
            }
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

