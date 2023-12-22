
package arraysprograms.intersection;

import java.util.Arrays;
import java.util.HashSet;

public class Intersection
{
    public static void main(String[] args) {
        String[] s1={"Abhi","Kanawade","Nayan"};
        String[] s2={"sanket","Kanawade","Siddharth"};
        HashSet hashSet=new HashSet<String>();


        for(int i=0;i<s1.length;i++)
        {
            for(int j=0;j<s2.length;j++)
            {
                if(s1[i].equalsIgnoreCase(s2[j])) {
                    hashSet.add(s1[i]);
                }

            }
        }
        System.out.println(hashSet);







    }
}
