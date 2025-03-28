package com.bridgelabz.setInterface;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class EqualSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for Set1
        System.out.println("Enter elements for Set1 (type 'done' to stop):");
        Set<Integer> set1 = inputSet(sc);

        // Taking input for Set2
        System.out.println("Enter elements for Set2 (type 'done' to stop):");
        Set<Integer> set2 = inputSet(sc);

        // Checking if sets are equal
        boolean isEqual = set1.equals(set2);
        System.out.println("Are the sets equal? " + isEqual);
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
I/P->
Enter elements for Set1 (type 'done' to stop):
4 6 7 2 done
Enter elements for Set2 (type 'done' to stop):
done

O/P->
Are the sets equal? false
 */
