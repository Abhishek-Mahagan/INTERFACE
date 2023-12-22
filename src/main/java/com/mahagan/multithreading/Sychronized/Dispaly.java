package com.mahagan.multithreading.Sychronized;

public class Dispaly {
    public synchronized void wish(String name)
    {
        for(int i=0;i<10;i++)
        {
            System.out.print("Good morning:");
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                System.out.println("I got intrrupted error");
            }
            System.out.println(name);
        }
    }

}
