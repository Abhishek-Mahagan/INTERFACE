package com.mahagan.pattern.pyramid.inversepyramid;

public class Pyramid
{
    public static void main(String[] args) {
        for(int i=1;i<=6;i++)
        {
            for (int j=i;j<=5;j++)
            {
                System.out.print("\t*");

            }
            System.out.println();
        }
    }
}
