package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private Map<String, List<String>> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public void add(String lastName, String phoneNumber) {
        if (phoneBook.containsKey(lastName)) {
            phoneBook.get(lastName).add(phoneNumber);
        } else {
            List<String> phoneNumbers = new ArrayList<>();
            phoneNumbers.add(phoneNumber);
            phoneBook.put(lastName, phoneNumbers);
        }
    }

    public List<String> get(String lastName) {
        return phoneBook.getOrDefault(lastName, new ArrayList<>());
    }

    public static void main(String[] args) {
        PhoneBook pb = new PhoneBook();

        pb.add("Дуров", "228-12-34");
        pb.add("Гейтс", "228-43-21");
        pb.add("Хоккинг", "666-12-34");
        pb.add("Дуров", "777-12-34");

        List<String> numeroUno = pb.get("Дуров");
        System.out.println("Телефоны Дуровых: " + numeroUno);

        List<String> numeroDue = pb.get("Гейтс");
        System.out.println("Телефоны Гейтсов: " + numeroDue);

        List<String> numeroTrio = pb.get("Хоккинг");
        System.out.println("Телефоны Хоккингов: " + numeroTrio);

        List<String> notExistant = pb.get("Джобс");
        System.out.println("Телефоны Джобсов: " + notExistant);
    }
}