package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBookN2 {
    private Map<String, List<String>> phoneBookN2;

    public PhoneBookN2() {
        phoneBookN2 = new HashMap<>();
    }

    public void add(String lastName, String phoneNumber) {
        if (phoneBookN2.containsKey(lastName)) {
            phoneBookN2.get(lastName).add(phoneNumber);
        } else {
            List<String> phoneNumbers = new ArrayList<>();
            phoneNumbers.add(phoneNumber);
            phoneBookN2.put(lastName, phoneNumbers);
        }
    }

    public List<String> get(String lastName) {
        return phoneBookN2.getOrDefault(lastName, new ArrayList<>());
    }

    public static class PhoneBookN2Test {
        public void runTest() {
            PhoneBookN2 pb = new PhoneBookN2();

            pb.add("Дуров", "228-12-34");
            pb.add("Гейтс", "228-43-21");
            pb.add("Хоккинг", "777-12-34");
            pb.add("Дуров", "666-12-34");

            List<String> numeroUno = pb.get("Дуров");
            System.out.println("Телефоны Дуровых: " + numeroUno);

            List<String> numeroDue = pb.get("Гейтс");
            System.out.println("Телефоны Гейтсов: " + numeroDue);

            List<String> numeroTrio = pb.get("Хоккинг");
            System.out.println("Телефоны Хоккингов: " + numeroTrio);

            List<String> nonExistentPhone = pb.get("Джобс");
            System.out.println("Телефоны Джобсов: " + nonExistentPhone);
        }
    }

    public static void main(String[] args) {
        PhoneBookN2Test test = new PhoneBookN2Test();
        test.runTest();
    }
}