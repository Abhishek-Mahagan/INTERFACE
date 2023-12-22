package com.mahagan.overrinding.ex;

public class Test
{
    public static void main(String[] args) {
        Demo1 demo1=new Demo1();
       /* demo1.m1();
        demo1.m2(20);*/
        //method resolution is always takes care by jvm at runtime
        Demo demo=new Demo1();
        demo.m1();
    }
}
