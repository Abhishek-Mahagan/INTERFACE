package com.mahagan.overloading.ParentObj;

public class Demo
{
    public void m1(String s)
    {
        System.out.println(" i am in the String");
    }
    public void m1(StringBuffer stringBuffer)
    {
        System.out.println("I am in the StringBufferArea");
    }
    public void m1(StringBuilder stringBuilder)
    {
        System.out.println("i am in the StringBuilder");
    }
}
