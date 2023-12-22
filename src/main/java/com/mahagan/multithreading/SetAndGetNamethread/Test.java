package com.mahagan.multithreading.SetAndGetNamethread;

import com.mahagan.multithreading.OverridingUsingSuper.Mythread;

public class Test {
    public static void main(String[] args) {
        Mythread mythread=new Mythread();
        System.out.println(Thread.currentThread().getName());
        Thread thread=new Thread();
       System.out.println(mythread.getName());
        Thread.currentThread().setName("Abhi");
        System.out.println(Thread.currentThread().getName());
        //System.out.println(100/0);


    }
}
