package com.mahagan.javalangpkg.autoboxing;

public class BufferingConcept
{
    public static void main(String[] args) {
        Integer X=new Integer(10);
        Integer Y=new Integer(20);
        //a new obj will be created so the ans is the false
        if(X==Y)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }

        System.out.println("Second program :");
        Integer A=10;
        Integer B=10;
        if(A==B)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }

        System.out.println("Third program");
        Integer S=Integer.valueOf(20);
        Integer D=Integer.valueOf(20);
        if(S==D)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}
