package com.mahagan.collection.stack;

import java.util.Stack;

public class Test
{
    private int a;

    public void setA(int a) {
        this.a = a;
    }

    public static void main(String[] args) {
        Stack stack=new Stack();
        stack.add("A");
        stack.add("B");
        stack.add("c");
        System.out.println(stack);
        System.out.println(stack.search("A"));
        System.out.println(stack.search("Z"));
    }

}
