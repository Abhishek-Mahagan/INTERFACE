
/*7) Write a Java program to separate zeros from non-zeros in an integer array?*/
package arraysprograms.removezerofromarray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class RemoveZero
{
    public static void main(String[] args) {
        int []a={-4, 1, 0, 0, 2, 21, 4};

        ArrayList arrayList=new ArrayList();
        int count=0;
        int value=0;
        for(int i=0;i< a.length;i++)
        {

            if(a[i]!=0)
            {
                arrayList.add(a[i]);
                value++;
            }
            else
            {
                count++;
            }
        }
        System.out.println(arrayList);
        System.out.println(count);
        System.out.println(value);
        int sum=count+value;
        for(int i=value;i<sum;i++)
        {
            a[i]=0;
            arrayList.add(a[i]);
        }
        System.out.println(arrayList);


    }
}
