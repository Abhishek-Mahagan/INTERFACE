package com.mahagan.multithreading.sleepmethod1;

public class Mythread extends Thread
{
    public void run()
    {
      try {
          for (int i=0;i<10;i++)
          {
              System.out.println("I AM LAZY THREAD");
              Thread.sleep(5000);
          }
      }
      catch (InterruptedException e)
      {
          System.out.println("WE GOT INTERRUPTED EXCEPTION");
      }
    }
}
