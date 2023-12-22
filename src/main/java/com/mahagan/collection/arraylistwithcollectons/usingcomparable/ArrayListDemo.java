package com.mahagan.collection.arraylistwithcollectons.usingcomparable;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo
{
    public static void main(String[] args) {
        ArrayList arrayList=new ArrayList();
        arrayList.add("Z");
        arrayList.add("A");
        arrayList.add("J");
        arrayList.add("p");
        System.out.println("normal arraylist"+arrayList);
        Collections.sort(arrayList);
        System.out.println("After using collections"+arrayList);
    }
}
