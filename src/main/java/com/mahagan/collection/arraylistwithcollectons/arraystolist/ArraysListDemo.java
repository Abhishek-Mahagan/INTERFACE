package com.mahagan.collection.arraylistwithcollectons.arraystolist;

import java.util.Arrays;
import java.util.List;

public class ArraysListDemo
{
    public static void main(String[] args) {
        String[] s={"A","Z","F"};
        List list= Arrays.asList(s);
        System.out.println(list);
        System.out.println("the list and arrays follows the same Object");
        list.set(0, "L");
        System.out.println(list);
        for( String s1:s)
            System.out.println(s1);
    }
}
