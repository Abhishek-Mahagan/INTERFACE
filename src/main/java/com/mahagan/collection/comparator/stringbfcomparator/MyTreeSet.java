package com.mahagan.collection.comparator.stringbfcomparator;

import java.util.TreeSet;

public class MyTreeSet
{
    public static void main(String[] args) {
        TreeSet treeSet=new TreeSet(new Test());
        treeSet.add(new StringBuffer("A"));
        treeSet.add(new StringBuffer("B"));
        treeSet.add(new StringBuffer("C"));
        treeSet.add(new StringBuffer("D"));
        System.out.println(treeSet);
    }
}
