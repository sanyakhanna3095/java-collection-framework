package com.bridgelabz.queueInterface;

import java.util.*;

public class ReverseQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();

        // Take user input for queue elements
        System.out.println("Enter elements of the queue (type 'done' to stop):");
        while (sc.hasNext()) {
            String input = sc.next();
            if (input.equalsIgnoreCase("done")) break;
            try {
                queue.add(Integer.parseInt(input));
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter integers.");
            }
        }

        // Reverse the queue using recursion
        reverseQueue(queue);


        System.out.println("Reversed Queue: " + queue);

    }

    // Recursive function to reverse a queue
    private static void reverseQueue(Queue<Integer> queue) {
        if (queue.isEmpty()) {
            return;
        }

        // Step 1: Remove front element
        int front = queue.remove();

        // Step 2: Recursively reverse the remaining queue
        reverseQueue(queue);

        // Step 3: Add the removed element to the rear
        queue.add(front);
    }
}

/*
I/P ->
Enter elements of the queue (type 'done' to stop):
1 2 3 4 5
done

O/P->
Reversed Queue: [5, 4, 3, 2, 1]
 */