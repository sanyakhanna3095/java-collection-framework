package com.bridgelabz.listInterface;

import java.util.*;

public class FrequencyMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for number of elements
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        sc.nextLine();

        List<String> list = new ArrayList<>();

        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            list.add(str);
        }

        // Calculate frequency
        Map<String, Integer> frequencyMap = getFrequencyMap(list);

        // Print frequency map
        System.out.println("Element Frequencies: " + frequencyMap);

    }

    // Method to calculate frequency of elements in a list
    public static Map<String, Integer> getFrequencyMap(List<String> list) {
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String element : list) {
            frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
        }
        return frequencyMap;
    }
}

/*
I/P->
Enter the number of elements: 4
Enter the elements:
apple
mango
apple
orange

O/P->
Element Frequencies: {orange=1, apple=2, mango=1}
 */