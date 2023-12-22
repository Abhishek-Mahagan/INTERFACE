package com.mahagan.overloading.NormalEx;

public class Test
{
    public static void main(String[] args) {
        First first=new First();
        first.m1(10,20.0f);
        first.m1(10.2f,'a');
        first.m1(100,100l);
        first.m1(100l,2);
    }
}
