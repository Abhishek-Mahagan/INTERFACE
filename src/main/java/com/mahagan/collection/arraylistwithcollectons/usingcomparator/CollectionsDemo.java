package com.mahagan.collection.arraylistwithcollectons.usingcomparator;



import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo
{
    public static void main(String[] args) {
        ArrayList arrayList=new ArrayList();
        arrayList.add("Z");
        arrayList.add("A");
        arrayList.add("D");
        arrayList.add("x");
        arrayList.add(Integer.valueOf(10));
        System.out.println(arrayList);
        Collections.sort(arrayList, new Mycomparator1());
        System.out.println(arrayList);

    }
}












