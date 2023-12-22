package com.mahagan.multithreading.WaitExa;

public class ThreadAs
{
    public static void main(String[] args) throws InterruptedException {
        ThreadBs threadBs=new ThreadBs();
        threadBs.start();
        Thread.sleep(1000);
        synchronized (threadBs)
        {
            threadBs.wait();
            System.out.println(threadBs.total);
        }
    }
}
