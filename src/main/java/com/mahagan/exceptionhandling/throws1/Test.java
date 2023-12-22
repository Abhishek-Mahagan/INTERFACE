package com.mahagan.exceptionhandling.throws1;

public class Test
{
    public static void main(String[] args) throws InterruptedException
    {
        doStuff();
    }
    public static void doStuff()throws InterruptedException
    {
        doMorestuff();
    }
    public static void doMorestuff()throws InterruptedException
    {
        Thread.sleep(1000);
    }
}
