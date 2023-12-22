package com.mahagan.multithreading.SychroBlock;

import javax.xml.namespace.QName;

public class Dispaly
{

       void wish(String name)
        {
            synchronized (this)
            {
                for (int i=0;i<10;i++)
                {
                    System.out.println("GOOD MORNING");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(name);
                }
            }
        }

}
