package com.mahagan.overloding1;

public class Test
{
    public static void main(String[] args) {
        Demo1 demo1=new Demo1();
        // in overloading the method resolution is always takes care by complier at complierTime
        demo1.m1();
        demo1.m1(20);

    }
}
