package com.mahagan.multithreading.SleepMethod;

import java.io.EOFException;
import java.util.List;

public class Multi extends Thread {


    public void run()
    {
        for (int i = 0; i < 6; i++) {
            System.out.println(i);
            try {
                sleep(300, 300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
