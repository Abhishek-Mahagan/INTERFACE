package com.mahagan.multithreading.WaitMethod;

public class ThreadA
{
    public static void main(String[] args) throws InterruptedException {
        ThreadB threadB=new ThreadB();
        threadB.start();
      /*  try {
            Thread.sleep(100);
        }
        catch (InterruptedException e){}*/
        /*threadB.join();*/

        System.out.println(threadB.total);
    }
}
