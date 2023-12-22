package com.mahagan.multithreading.SychroBlock;

public class SychroBlock
{
    public static void main(String[] args) {
        Dispaly d=new Dispaly();
        Mythread t1=new Mythread(d,"Dhoni");
        Mythread t2=new Mythread(d,"Yuvi");
        t1.start();
        t2.start();
    }
}
