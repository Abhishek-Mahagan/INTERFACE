package arraysprograms.secondlastelements;

import java.util.Arrays;

public class SecondLastElements {
    public static void main(String[] args) {
        int a[]={22,33,99,55,22,70,166,437,244,90};
        Arrays.sort(a);
        System.out.println("Sorted arrays");
        for(int a1:a)
        {
            System.out.print("\t"+a1);
        }
        System.out.println();
        System.out.println("Find seconds large elements in arrays");

            System.out.println(a[a.length-2]);

    }
}
