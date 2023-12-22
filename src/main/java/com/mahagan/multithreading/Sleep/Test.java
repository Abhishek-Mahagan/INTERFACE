package com.mahagan.multithreading.Sleep;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Mythread mythread=new Mythread();
        mythread.start();
        mythread.join(10000);
        for (int i=0;i<10;i++)
        {
            System.out.println("main Thread");
        }
    }
}
