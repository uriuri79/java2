package ru.gb.yartsev.lesson2_3;

public class PhoneBookApp {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        System.out.println();
        phoneBook.add("Иванов", "+7(999)123-45-67");
        phoneBook.add("Петров", "+7(999)345-67-89");
        phoneBook.add("Сидоров", "+7(999)987-65-43");
        phoneBook.add("Петров", "+7(999)888-77-66");
        phoneBook.info();
        System.out.println();
        System.out.println("Номер телефона человека по фамилии Петров: " + phoneBook.get("Петров"));
        System.out.println("Номер телефона человека по фамилии Иванов: " + phoneBook.get("Иванов"));
    }
}
