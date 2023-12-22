package com.mahagan.IntefaceEx;

public class Document implements Printable
{
    @Override
    public void print() {
        System.out.println("I am in the document class using printale interface");
    }
}
