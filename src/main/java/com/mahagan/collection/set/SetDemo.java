package com.mahagan.collection.set;

import java.util.HashSet;

public class SetDemo
{
    public static void main(String[] args) {
        HashSet hashSet=new HashSet();
        System.out.println(hashSet.add("Abhi"));
        System.out.println(hashSet.add("abhi"));
        //not case sensetive
        System.out.println(hashSet);
    }
}
