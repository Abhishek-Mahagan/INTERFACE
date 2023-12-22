package com.mahagan.collection.listiteration;

import java.util.ArrayList;
import java.util.ListIterator;

public class Test {
    public static void main(String[] args) {
        ArrayList arrayList=new ArrayList();
        arrayList.add("abhi");
        arrayList.add("kanawade");
        arrayList.add("sangamner");
        arrayList.add("pune");
        System.out.println(arrayList);
        ListIterator listIterator=arrayList.listIterator();
        while(listIterator.hasNext())
        {
            String str=(String)listIterator.next();
            if(str.equalsIgnoreCase("abhi"))
            {
                listIterator.add("maharashtra");
            } else if (str.equalsIgnoreCase("kanawade"))
            {
                listIterator.set("Shinde");
            } else if (str.equalsIgnoreCase("Pune"))
            {
                listIterator.remove();
            }
        }
        System.out.println(arrayList);
    }
}
