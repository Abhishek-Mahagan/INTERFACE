package com.mahagan.collection.comparator.stringandsb;

import java.util.TreeSet;

public class MyComparator
{
    public static void main(String[] args) {
        TreeSet treeSet=new TreeSet();
        treeSet.add("A");
        treeSet.add(new StringBuffer("XX"));
        treeSet.add(new StringBuffer("AA"));
        treeSet.add("ABC");
        System.out.println(treeSet);
    }
}
