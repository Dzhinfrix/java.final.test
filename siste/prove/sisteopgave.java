package siste.prove;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
  * sisteopgave
  */
 public class sisteopgave {
 
    public static void main(String[] args) {
        Map<String, List<String>> phoneBook = new HashMap<>();
        phoneBook.put("Alekseev ", Arrays.asList("123-456", "789-012"));
        phoneBook.put("Petrov ", Arrays.asList("111-222", "555-333"));
        phoneBook.put("Sidorov ", Arrays.asList("124-456"));
        phoneBook.put("Ivanov ", Arrays.asList("999-888"));
        
         TreeMap<Integer, List<String>> sortedPhoneBook = new TreeMap<>(Collections.reverseOrder());

        
        for (Map.Entry<String, List<String>> entry : phoneBook.entrySet()) {
            int numPhones = entry.getValue().size();
            sortedPhoneBook.putIfAbsent(numPhones, new ArrayList<>());
            sortedPhoneBook.get(numPhones).add(entry.getKey());
        }

        
        for (Map.Entry<Integer, List<String>> entry : sortedPhoneBook.entrySet()) {
            List<String> names = entry.getValue();
            for (String name : names) {
                System.out.println(name + ": " + phoneBook.get(name));

            }

            

        }


    }
 }
