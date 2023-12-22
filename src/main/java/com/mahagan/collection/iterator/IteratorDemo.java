package com.mahagan.collection.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo
{
    public static void main(String[] args) {
        ArrayList arrayList=new ArrayList();
        System.out.println(arrayList.size());
        for(int i=0;i<=10;i++)
        {
            arrayList.add(i);
        }
        System.out.println(arrayList);
        Iterator iterator=arrayList.iterator();
        while (iterator.hasNext())
        {
            Integer integer=(Integer)iterator.next();
            if(integer%2==0)
            {
                System.out.println(integer);
            }
            else
            {
                iterator.remove();
            }
        }
        System.out.println(arrayList);
    }
}
