package com.mahagan.multithreading.SychWithTwoThread;

public class Mythread2 extends Thread
{
    Display d;

    public Mythread2(Display d) {
        this.d = d;
    }
    public void run()
    {
        d.displayc();
    }
}
