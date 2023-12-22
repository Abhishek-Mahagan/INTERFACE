package arraysprograms.mostfrequent;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class FrequencyOfNumber
{
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 7, 4, 5, 7, 6, 7, 3, 4};
        Arrays.sort(a);
        HashSet hashSet=new HashSet();
        for (int a1 : a) {
            System.out.println(a1);
        }
       for(int i=0;i<a.length;i++)
       {
           int count=0;

           for (int j=i;j<a.length;j++)
           {
               if(a[i]==a[j])
               {
                   count++;
                   i=j;
               }


           }
           if(count>1)
           {

               System.out.println("The repeated=>"+a[i]+""+count);

           }
          // int temp=Math.max();

           for(int j=0;j<count;j++)
           {
               //temp=count;
               //count=

           }



       }
    }
}
