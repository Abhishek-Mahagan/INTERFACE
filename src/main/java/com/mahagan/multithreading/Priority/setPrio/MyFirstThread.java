package com.mahagan.multithreading.Priority.setPrio;

public class MyFirstThread extends Thread
{
    public void run()
    {
        for (int i=0;i<5;i++)
        {
            System.out.println("child");
        }
    }
}
