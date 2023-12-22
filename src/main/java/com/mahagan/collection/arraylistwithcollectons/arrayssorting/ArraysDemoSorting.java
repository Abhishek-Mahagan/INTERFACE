package com.mahagan.collection.arraylistwithcollectons.arrayssorting;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysDemoSorting
{
    public static void main(String[] args) {
        int a[]={6,1,9,3,55,33,99,100,44};
        System.out.println("After sorting primittive arrays");
        for(int a1:a)
        {
            System.out.println(a1);
        }
        System.out.println("After the sorting using sort");
        Arrays.sort(a);
        for(int a1:a)
        {
            System.out.println(a1);
        }
        String s1[]={"Z","A","B"};
        for(String s:s1)
        {
            System.out.println(s);
        }
        System.out.println("Using the Comparator method");
        Arrays.sort(s1, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String s2=o1.toString();
                String s3=o2.toString();
                return s3.compareTo(s2);

            }
        });
        for(String s2:s1)
        {
            System.out.println(s2);
        }
    }
}
