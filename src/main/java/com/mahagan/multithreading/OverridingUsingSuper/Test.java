package com.mahagan.multithreading.OverridingUsingSuper;

public class Test
{
    public static void main(String[] args) {
        Mythread mythread=new Mythread();
        mythread.start();
        System.out.println("main");
    }
}
