package com.mahagan.javalangpkg.clone.shallowclonning;

public class Dog implements Cloneable
{
    Cat c;
    int i;
    Dog(Cat c,int i)
    {
        this.c=c;
        this.i=i;
    }
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}
