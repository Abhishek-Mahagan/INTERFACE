package com.mahagan.multithreading.OverridingUsingSuper;

public class Mythread extends Thread {
    public void start()
    {
        super.start();
        System.out.println("Start Method");
    }
    public void run()
    {
        System.out.println("run method");
    }
}
