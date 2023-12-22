package com.mahagan.pattern.pyramid.halfpyramid;

public class HalfPyramid
{
    public static void main(String[] args) {
        int count=0;
        for(int i=1;i<=6;i++)
        {
            count++;
            for (int j=1 ; j<=count;j++ )
            {
                System.out.print("\t*");
            }
            System.out.println();

        }
    }
}
