package ru.gb.yartsev.lesson2_3;
import java.util.*;

public class UniqueWord {
    private String [] myArray;

    private Map<String, Integer> createHashMap() {
        Map<String, Integer> myHashMap = new HashMap<>();
        for (String word : Objects.requireNonNull(myArray)) {
            int value = myHashMap.getOrDefault(word, 0) + 1;
            myHashMap.put(word, value);
        }
        return myHashMap;
    }

    public UniqueWord(String[] myArray) {
        this.myArray = myArray;
    }

    public void uniqueWordSet() {
        Set<String> myHashSet = new HashSet<>();
        for (String word : myArray) {
            myHashSet.add(word);
        }
        System.out.println();
        System.out.println(myHashSet);
    }

    public void repeatWordCount() {
        Map<String, Integer> myHashMap = createHashMap();
        System.out.println();
        System.out.println("ПОДСЧЕТ ПОВТОРЯЮЩИХСЯ СЛОВ");
        for (Map.Entry <String, Integer> entry : myHashMap.entrySet()) {
            System.out.println("Слово \"" + entry.getKey() + "\"" + " встречается " + entry.getValue() + " раз(раза)");
        }
    }

    public void uniqueWordInfo() {
        System.out.println();
        System.out.println("СПИСОК СЛОВ, ВСТРЕЧАЮЩХСЯ 1 РАЗ:");
        Map<String, Integer> myHashMap = createHashMap();
        for (Map.Entry <String, Integer> entry : myHashMap.entrySet()) {
            Integer val = entry.getValue();
            if (val == 1) {
                System.out.println(entry.getKey());
            }
        }
    }


}
