package com.mahagan.collection.comparator.comparator1;

import com.mahagan.collection.comparator.comparator1.ComparatorDemo;

import java.util.TreeSet;

public class Test
{
    public static void main(String[] args) {
        TreeSet treeSet=new TreeSet( new ComparatorDemo());
        treeSet.add(10);
        treeSet.add(0);
        treeSet.add(55);
        treeSet.add(40);
        treeSet.add(20);
        System.out.println(treeSet);

    }
}
