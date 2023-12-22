package com.mahagan.collection.comparator.employeecomparator;

import java.util.Comparator;

public class CompComp implements Comparator
{

    @Override
    public int compare(Object o1, Object o2) {
        Employee obj1=(Employee)o1;
        Employee obj2=(Employee)o2;
        String s1=obj1.name;
        String s2=obj2.name;
        return s1.compareTo(s2);

    }
}
