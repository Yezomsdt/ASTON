package org.example;

import java.util.HashMap;
import java.util.Map;

public class DinoCounter {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_BLUE = "\u001B[34m";

    public static void main(String[] args) {
        String[] wordsArray = {
                "диплодок", "трицератопс", "велоцераптор", "тираннозавр", "птеродактель",
                "тираннозавр", "стегозавр", "стегозавр", "спинозавр", "брахиозавр",
                "пахицефалозавр", "кентрозавр", "диплодок", "диплодок", "ирритатор"
        };

        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : wordsArray) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        System.out.println(ANSI_BLUE + "Уникальные слова:" + ANSI_RESET);
        for (String uniqueWord : wordCount.keySet()) {
            System.out.println(uniqueWord);
        }

        System.out.println(ANSI_PURPLE + "Всего слов:" + ANSI_RESET);
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}