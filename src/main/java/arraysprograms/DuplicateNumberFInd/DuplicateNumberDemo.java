


/*1) Write a Java program to find duplicate elements in an array?*/
package arraysprograms.DuplicateNumberFInd;

import java.util.Arrays;
import java.util.List;

public class DuplicateNumberDemo
{
    public static void main(String[] args) {
        int a[]={1,3,5,3,1,1,3,5,6,2,3};
        Arrays.sort(a);
        System.out.println("WE SOERTED Arrays");
        for(int a1:a)
        {
            System.out.println(a1);
        }
        for(int i=0;i< a.length;i++)
        {
            int count=0;
            for(int j=i;j< a.length;j++)
            {
                if(a[i]==a[j])
                {
                    count++;
                    i=j;
                }

            }
            if(count>1)
            {
                System.out.println(a[i]+".."+count);

            }

        }
    }
}
