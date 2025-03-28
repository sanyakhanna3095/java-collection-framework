package com.bridgelabz.listInterface;

import java.util.*;

public class ListReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Take user input for number of elements and elements itself
        System.out.println("Enter size of lists: ");
        int n=sc.nextInt();
        ArrayList<Integer> l1=new ArrayList<>();
        LinkedList<Integer> l2=new LinkedList<>();

        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            int num= sc.nextInt();
            l1.add(num);
            l2.add(num);
        }


        // make a call to reverse method to reverse the lists
//        Collections.reverse(l1);
//        Collections.reverse(l2);

        reverseList(l1);
        reverseList(l2);

        //call printList method to print the reversed lists
        System.out.println("Reversed Lists: ");
        System.out.println(l1);
        System.out.println(l2);
    }

    //Method to reverse List of any type
    public static void reverseList(List<Integer> l) {
        int left = 0, right = l.size() - 1;
        while (left < right) {
            // Swap elements
            int temp = l.get(left);
            l.set(left, l.get(right));
            l.set(right, temp);
            left++;
            right--;
        }
    }
}


/*
I/P ->
Enter size of lists:
5
Enter the elements:
1 2 3 4 5

O/P ->
Reversed Lists:
[5, 4, 3, 2, 1]
[5, 4, 3, 2, 1]
 */