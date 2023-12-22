package com.mahagan.pattern.hallowrectangle;

public class Hallow
{
    public static void main(String[] args) {
        for(int i=1;i<=3;i++)
        {
            for (int j=1;j<=5;j++)
            {
                if(i==1 || i==3)
                {
                    System.out.print("\t*");
                }
                if(i==2&&j==1 || i==2&&j==5)
                {

                    System.out.print("\t*");
                    System.out.print("\t\t\t");
                }

            } System.out.println();
        }
    }
}
