package ru.gb.yartsev.lesson2_3;

import java.util.*;

public class PhoneBook {
    public final Map<String, List<String>> phones = new HashMap<>();

    void add(String name, String phone) {
        List<String> listPhones = new ArrayList<>(Arrays.asList(phone));
        phones.merge(name, listPhones,
                (prev, curr) -> {
                    prev.addAll(curr);
                    return prev;
                });
    }

    List<String> get(String name) {
        return phones.getOrDefault(name, List.of());
    }

    void info() {
        phones.forEach((K, V) -> System.out.println("Человеку по фамилии " + K + " принадлежит телефон " + V));
    }


}
