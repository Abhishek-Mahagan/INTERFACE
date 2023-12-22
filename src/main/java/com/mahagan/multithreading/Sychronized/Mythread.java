package com.mahagan.multithreading.Sychronized;

public class Mythread extends Thread
{
    Dispaly d;
    String name;

    public Mythread(Dispaly d, String name) {
        this.d = d;
        this.name = name;
    }
    public void run()
    {
        d.wish(name);
    }
}
