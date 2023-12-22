package com.mahagan.IntefaceEx;

public class Photo implements Printable
{
    @Override
    public void print() {
        System.out.println("I am in the Photo class using printabl interface");
    }
}
