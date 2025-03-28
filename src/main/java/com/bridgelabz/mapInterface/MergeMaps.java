package com.bridgelabz.mapInterface;

import java.util.*;

public class MergeMaps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        // Input for the first map
        System.out.println("Enter number of key-value pairs for Map1:");
        int n1 = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n1; i++) {
            System.out.println("Enter key (String):");
            String key = sc.nextLine();
            System.out.println("Enter value (Integer):");
            int value = sc.nextInt();
            sc.nextLine();
            map1.put(key, value);
        }

        // Input for the second map
        System.out.println("Enter number of key-value pairs for Map2:");
        int n2 = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n2; i++) {
            System.out.println("Enter key (String):");
            String key = sc.nextLine();
            System.out.println("Enter value (Integer):");
            int value = sc.nextInt();
            sc.nextLine();
            map2.put(key, value);
        }

        // Merge the maps, summing values if a key exists in both
        Map<String, Integer> mergedMap = new HashMap<>(map1);
        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            mergedMap.merge(entry.getKey(), entry.getValue(), Integer::sum);
        }

        System.out.println("Merged Map: " + mergedMap);

    }
}

/*
I/P ->
Enter number of key-value pairs for Map1:
2
Enter key (String):
A
Enter value (Integer):
1
Enter key (String):
B
Enter value (Integer):
2
Enter number of key-value pairs for Map2:
2
Enter key (String):
B
Enter value (Integer):
3
Enter key (String):
C
Enter value (Integer):
4

O/P->
Merged Map: {A=1, B=5, C=4}
 */