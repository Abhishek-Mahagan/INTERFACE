package com.mahagan.javalangpkg.exceoptionHandling;

public class Test
{
    public static void main(String[] args)
    {
       int age=88;
       if(age<18)
       {
          throw  new AgeIsToSmall("TOO Young Age of marriage");
       }
       else if (age>58)
       {
           throw new AgeIsLarge("TOO Large Of marriage");
       }
       else
       {
           System.out.println("Message get soon");
       }
    }

}
