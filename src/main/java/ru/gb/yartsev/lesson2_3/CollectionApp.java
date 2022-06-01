package ru.gb.yartsev.lesson2_3;

public class CollectionApp {
    public static void main(String[] args) {
        String [] myArray = new String[] {
                "выходной", "дом", "день", "люди", "ребёнок",
                "человек", "люди", "подъезд", "компьютер", "друг",
                "лифт", "ребёнок", "люди", "дом", "телефон",
                "ребёнок", "дом", "люди", "день", "ребёнок",
                "человек", "люди", "поезд", "книга", "друг"
        };

        UniqueWord uniqueWord = new UniqueWord(myArray);
        uniqueWord.uniqueWordSet();
        uniqueWord.repeatWordCount();
        uniqueWord.uniqueWordInfo();
    }
}

