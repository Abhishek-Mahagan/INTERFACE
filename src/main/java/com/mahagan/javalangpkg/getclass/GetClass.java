package com.mahagan.javalangpkg.getclass;

import java.lang.reflect.Method;

public class GetClass
{
    public static void main(String[] args) {
        int count=0;
        Object o= new String("abhi");
        Class c=o.getClass();
        System.out.println("the class name"+c.getName());
        Method m[]=c.getDeclaredMethods();
        for(Method m1:m)
        {
            count++;
            System.out.println(m1.getName());
        }
        System.out.println(count);
    }
}
