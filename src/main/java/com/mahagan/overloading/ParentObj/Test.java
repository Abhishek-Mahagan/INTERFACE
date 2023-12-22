package com.mahagan.overloading.ParentObj;

public class Test
{
    public static void main(String[] args)
    {
        Demo demo=new Demo();
        demo.m1("abhi");
        demo.m1(new StringBuffer("kanawade"));
        demo.m1(new StringBuilder("sanket"));
       try {
           demo.m1(new StringBuilder(null));
       }
       catch (NullPointerException n)
       {
           System.out.println("We got null point");
       }
       // demo.m1(new StringBuffer(null));
        //demo.m1(null);
    }
}
