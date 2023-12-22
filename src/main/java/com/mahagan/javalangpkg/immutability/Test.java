package com.mahagan.javalangpkg.immutability;

public class Test
{
    public static void main(String[] args) {
        Immutable t=new Immutable(10);
        Immutable t1=t.modifier(100);
        Immutable t2=t.modifier(10);
        if(t==t1)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
        if(t==t2)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }


    }
}
