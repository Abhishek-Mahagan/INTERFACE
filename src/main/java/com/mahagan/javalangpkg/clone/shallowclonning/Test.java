package com.mahagan.javalangpkg.clone.shallowclonning;

public class Test
{
    public static void main(String[] args) throws CloneNotSupportedException {
        Cat c=new Cat(20);
        Dog d1=new Dog(c,10);
        Dog d2=(Dog)d1.clone();
        System.out.println(d1.i+"......"+d1.c.j);
        d2.i=88;
        d2.c.j=9999;
        System.out.println(d1.i+"......"+d1.c.j);
    }
}
