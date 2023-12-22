package com.mahagan.multithreading.Priority;

import com.mahagan.multithreading.OverridingUsingSuper.Mythread;

public class Test {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getPriority());
        Mythread mythread=new Mythread();
        System.out.println(mythread.getPriority());
        Thread.currentThread().setPriority(8);
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(mythread.getPriority());
    }
}
