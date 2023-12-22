package com.mahagan.multithreading.sleepmethod1;

public class myinterrupt
{
    public static void main(String[] args) {
        Mythread mythread=new Mythread();
        mythread.start();
        mythread.interrupt();
        System.out.println("IN MAIN METHOD");
    }
}
