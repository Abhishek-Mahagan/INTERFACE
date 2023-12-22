package com.mahagan.multithreading.consumer;

public class Producer
{
    private int item;

    public void items()
    {
        item=item+1;
    }

    public int getItem() {
        return item;
    }


    public void setItem(int item) {
        this.item = item;
    }

    public Producer(int item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Producer{" +
                "item=" + item +
                '}';
    }
 Producer p=new Producer(1);
    public void produce()
    {

        synchronized (p)
        {
            p.items();

        }
    }


}