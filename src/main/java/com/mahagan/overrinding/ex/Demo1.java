package com.mahagan.overrinding.ex;

public class Demo1 extends Demo
{
    @Override
    void m1()
    {
        System.out.println("I am in the child class ");

    }

    @Override
    void m2(int n) {
        System.out.println("I am in the child class with paramater Int");
    }
}
