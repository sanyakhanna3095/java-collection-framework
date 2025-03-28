package com.bridgelabz.setInterface;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SymmetricDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for Set1
        System.out.println("Enter elements for Set1 (type 'done' to stop):");
        Set<Integer> set1 = inputSet(sc);

        // Taking input for Set2
        System.out.println("Enter elements for Set2 (type 'done' to stop):");
        Set<Integer> set2 = inputSet(sc);

        // Compute Symmetric Difference
        Set<Integer> symmetricDifference = new HashSet<>(set1);

        // Union
        symmetricDifference.addAll(set2);

        Set<Integer> intersectionSet = new HashSet<>(set1);
        // Intersection
        intersectionSet.retainAll(set2);

        // Remove Intersection
        symmetricDifference.removeAll(intersectionSet);

        // Display Result
        System.out.println("Symmetric Difference: " + symmetricDifference);
    }

    // Helper method to take input and return a set
    private static Set<Integer> inputSet(Scanner sc) {
        Set<Integer> set = new HashSet<>();
        while (sc.hasNext()) {
            String input = sc.next();
            if (input.equalsIgnoreCase("done")) break;
            try {
                set.add(Integer.parseInt(input));
            }
            catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter integers.");
            }
        }
        return set;
    }
}


/*
Logic:
SymmetricDifference = (Set1 ∪ Set2) − (Set1 ∩ Set2)

I/P->
Enter elements for Set1 (type 'done' to stop):
1 5 2 3 2 done
Enter elements for Set2 (type 'done' to stop):
2 3 1 5 done

O/P->
Symmetric Difference: []
 */