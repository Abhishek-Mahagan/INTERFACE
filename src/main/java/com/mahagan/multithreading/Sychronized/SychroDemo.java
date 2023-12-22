package com.mahagan.multithreading.Sychronized;

public class SychroDemo
{
    public static void main(String[] args) {
        /*if multiple threads operates on the same object then we required sychronization */
        Dispaly d=new Dispaly();
        Mythread t=new Mythread(d,"Dhoni");
        Mythread t1=new Mythread(d,"KOLHI");
        t.start();
        t1.start();
        /*
        * but if multiple threads operates on multiple objects then we not required for
        * sychronization
        *  Dispaly d1=new Dispaly();
        *  Dispaly d2=new Dispaly();
        Mythread t=new Mythread(d1,"Dhoni");
        Mythread t1=new Mythread(d2,"KOLHI");
        t.start();
        t1.start();
        *
        * */
    }
}
