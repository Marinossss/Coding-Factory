package gr.aueb.cf.ch14Collections;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class CharStats {
    public static void main(String[] args) {
        List<Character> myList = new LinkedList<>();
        File inFile = new File("C:/tmp/CharacterStats.txt");
        try (InputStreamReader reader = new InputStreamReader(new FileInputStream(inFile))) {
            int ch;


            while ((ch = reader.read()) != -1) {
                myList.add((char) ch);
            }

        } catch (IOException e) {
            e.printStackTrace();

        }


        Map<Character, Integer> frequencyMap = countFrequencies(myList);


        displayResults(frequencyMap);
    }


    public static Map<Character, Integer> countFrequencies(List<Character> charList) {
        Map<Character, Integer> charFrequency = new HashMap<>();

        for (char ch : charList) {
            charFrequency.put(ch, charFrequency.getOrDefault(ch, 0) + 1);
        }

        return charFrequency;
    }


    public static void displayResults(Map<Character, Integer> frequencyMap) {


        System.out.println("Ταξινόμηση ανά χαρακτήρα: ");
        frequencyMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(entry -> System.out.printf("Χαρακτήρας: '%c' | Συχνότητα: %d\n", entry.getKey(), entry.getValue()));


        System.out.println("Ταξινόμηση ανά συχνότητα εμφάνισης: ");
        frequencyMap.entrySet().stream()
                .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
                .forEach(entry -> System.out.printf("Χαρακτήρας: '%c' | Συχνότητα: %d\n", entry.getKey(), entry.getValue()));
    }
}
