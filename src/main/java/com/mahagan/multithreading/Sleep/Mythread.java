package com.mahagan.multithreading.Sleep;

public class Mythread extends Thread
{
    public void run()
    {
        for (int i=0;i<10;i++) {
            System.out.println("Child thread");
            try {
                sleep(2000);
            }
            catch (InterruptedException e){}
        }

    }

}
