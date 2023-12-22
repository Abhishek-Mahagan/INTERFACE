package com.mahagan.pattern.solidRectangle;
//x x x x x
//x x x x x
//x x x x x

public class SolidRect
{
    public static void main(String[] args) {
        for(int i=1;i<=3;i++ )
        {
            for (int j=1;j<=5;j++)
            {
                System.out.print("\t*");
            }
            System.out.println();
        }
    }
}
