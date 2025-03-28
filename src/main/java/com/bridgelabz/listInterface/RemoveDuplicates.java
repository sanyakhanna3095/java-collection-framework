package com.bridgelabz.listInterface;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Take user input for number of elements and elements itself
        System.out.println("Enter number of elements: ");
        int n=sc.nextInt();
        List<Integer> l=new ArrayList<>();
        System.out.println("Enter " + n+ " integers: ");
        for(int i=0;i<n;i++){
            l.add(sc.nextInt());
        }

        HashSet<Integer> set = new HashSet<>();
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<n;i++){
            int t=l.get(i);
            if(!set.contains(t)){
                set.add(t);
                res.add(t);
            }
        }
        System.out.println("Resulting list: ");
        for(int i=0;i< res.size();i++){
            System.out.print(res.get(i)+" ");
        }
    }

}
