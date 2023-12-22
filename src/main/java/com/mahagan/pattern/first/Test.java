package com.mahagan.pattern.first;

public class Test
{
    public static void main(String[] args) {
        int count=0;
        for(int i=1;i<=5;i++)
        {
            count++;
            for(int j=1;j<=count;j++)
            {
                System.out.print("\t"+j);
            }


            System.out.println();

        }
    }
}
