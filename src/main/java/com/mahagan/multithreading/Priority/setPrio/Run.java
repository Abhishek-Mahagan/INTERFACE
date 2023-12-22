package com.mahagan.multithreading.Priority.setPrio;

public class Run {
    public static void main(String[] args) {
        MyFirstThread myFirstThread=new MyFirstThread();
        myFirstThread.setPriority(10);
        myFirstThread.start();
        for (int i=0;i<5;i++)
        {
            System.out.println("main class");
        }
    }
}
