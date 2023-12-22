package com.mahagan.collection.enumeration;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo
{
    public static void main(String[] args) {
        Vector vector=new Vector();
        System.out.println(vector.capacity());
        for(int i=0;i<=10;i++)
        {
            vector.addElement(i);
        }
        System.out.println(vector);
        Enumeration enumeration=vector.elements();
        while (enumeration.hasMoreElements())
        {
            Integer I=(Integer)enumeration.nextElement();
            if(I%2==0)
            {
                System.out.println(I);
            }
        }
        System.out.println(vector);


    }
}
