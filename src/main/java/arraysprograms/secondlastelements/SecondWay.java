package arraysprograms.secondlastelements;

import java.util.Arrays;

public class SecondWay
{
    public static void main(String[] args) {
        int a[]={22,33,99,55,22,70,166,437,244,90};
        Arrays.sort(a);
        System.out.println("Sorted arrays");
        for(int a1:a)
        {
            System.out.print("\t"+a1);
        }


    }
}
