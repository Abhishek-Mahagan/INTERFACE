package com.mahagan.collection.comparator.employeecomparator;

import java.util.TreeSet;

public class Test
{
    public static void main(String[] args) {
        Employee e1=new Employee("Abhi",66);
        Employee e2=new Employee("krushna",55);
        Employee e3=new Employee("shubham",33);
        Employee e4=new Employee("niks",88);
        Employee e5=new Employee("rohan",64);
       /* TreeSet treeSet=new TreeSet();
        treeSet.add(e1);
        treeSet.add(e2);
        treeSet.add(e3);
        treeSet.add(e4);
        treeSet.add(e5);
        System.out.println(treeSet);*/
      TreeSet treeSet1=new TreeSet(new CompComp());
      treeSet1.add(e1);
        treeSet1.add(e2);
        treeSet1.add(e3);
        treeSet1.add(e4);
        treeSet1.add(e5);
        System.out.println(treeSet1);
    }
}
