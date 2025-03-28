package com.bridgelabz.listInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListRotation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Take user input for number of elements and elements itself
        System.out.println("Eneter number of elements: ");
        int n=sc.nextInt();
        List<Integer> l=new ArrayList<>();
        System.out.println("Enter " + n+ " integers: ");
        for(int i=0;i<n;i++){
            l.add(sc.nextInt());
        }

        //take input number by which we want to rotate the list
        System.out.println("Enter number of positions to rotate list by: ");
        int k=sc.nextInt();

        rotateList(l, k);
        System.out.println("Rotated list: ");
        for(int i=0;i<n;i++){
            System.out.print(l.get(i)+" ");
        }
    }

    public static void rotateList(List<Integer> l, int k){
        int n=l.size();

        //To handle case where k>n
        k=k%n;


        reverse(l,0,n-1);
        reverse(l,0,n-k-1);
        reverse(l,n-k,n-1);
    }


    static void reverse(List<Integer> list, int l, int r){
        while(l<r){
            int temp=list.get(l);
            list.set(l, list.get(r));
            list.set(r,temp);
            l++;
            r--;
        }
    }

}


/*
I/P ->
Eneter number of elements:
7
Enter 7 integers:
1 2 3 4 5 6 7
Enter number of positions to rotate list by:
2

O/P ->
Rotated list:
3 4 5 6 7 1 2
 */