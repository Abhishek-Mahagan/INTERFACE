
/*4) Write a Java program to find all pairs of
 elements in an integer array whose sum is equal to a given number?*/
package arraysprograms.pair_element;

public class PairElements
{
    public static void main(String[] args) {
        int a=Integer.parseInt("10");
        System.out.println(a);
        int array[]={1,2,5,5,8,2,6,4,12,-2};
        for(int i=0;i<array.length;i++)
        {
            for(int j=i;j<array.length;j++)
            {
                if(array[i]+array[j]==a)
                {
                    System.out.println("The pair is =>"+array[i]+"..and.."+array[j]);

                }


            }

        }


    }
}
