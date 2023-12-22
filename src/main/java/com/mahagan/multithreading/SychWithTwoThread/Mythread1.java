package com.mahagan.multithreading.SychWithTwoThread;

public class Mythread1 extends Thread
{
    Display d;

    public Mythread1(Display d) {
        this.d = d;
    }
    public void run()
    {
        d.displayn();
    }
}
