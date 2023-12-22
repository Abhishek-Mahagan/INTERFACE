package com.mahagan.singletonclass;

 public class Text
{

    private static Text t=new Text();
    private Text()
    {
        /*System.out.println("I am in default constructor");*/

    }

    public static Text getText()
    {

        return t;
    }
}
