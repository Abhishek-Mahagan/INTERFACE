package arraysprograms.duplicate;

import com.mahagan.pattern.hallowrectangle.Hallow;

import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateArrays
{
/*The sorting arrays
1
1
1
2
2
3
3
4
4
5
7
8
9

Process finished with exit code 0
*/
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,1,2,3,1,4,7,8,9};
        Arrays.sort(a);
        System.out.println("The sorting arrays");
        ArrayList arrayList=new ArrayList();
        for(int a1:a)
        {
            System.out.println(a1);
        }
        for(int i=0;i<a.length;i++)
        {
            int count=0;
            for(int j=i;j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                    i=j;
                    count++;

                }
            }
            if(count>1)
            {

            }
        }
    }
}
