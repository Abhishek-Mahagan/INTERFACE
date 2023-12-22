package arraysprograms.movinginfrontzero;

import java.util.ArrayList;

public class Test
{
    public static void main(String[] args) {
        int[]a={1,2,3,4,-5,0,3,6,0,99};
        int count=0;
        int value=0;
        ArrayList<Integer> arrayList=new ArrayList<Integer>();
        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=0)
            {
                arrayList.add(a[i]);
                value++;
            }
            else
            {
                count--;
            }
        }
        System.out.println(arrayList);

        /*
        * count=-2;
        * 0>-2
        * -1
        * 0>-2
        * 0
        * 0>0
        * */

        for(int i=count;i<0;i++)
            arrayList.add(a[i] = 0);
        System.out.println(arrayList);

    }
}
