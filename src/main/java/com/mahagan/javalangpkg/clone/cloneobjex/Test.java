package com.mahagan.javalangpkg.clone.cloneobjex;

public class Test implements Cloneable
{
    int i=10;
    int j=20;

    public static void main(String[] args) throws CloneNotSupportedException {
        Test t=new Test();
        Test t2=(Test)t.clone();
        t2.i=999;
        t2.j=888;
        System.out.println(t.i+"----------"+t.j);
    }
}
