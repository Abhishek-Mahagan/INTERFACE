package com.mahagan.multithreading.consumer;

public class Consumer
{
    public static void main(String[] args) throws InterruptedException {
        Consumer consumer=new Consumer();
        Producer producer=new Producer(1);

        synchronized (consumer)
        {
            if(producer.equals(consumer))
            {
                consumer.wait();
            }
            else
            {
                producer.items();
            }

        }
    }
}
