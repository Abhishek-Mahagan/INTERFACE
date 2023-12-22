package arraysprograms.commomelementsininteger;

import java.util.HashSet;

public class Test
{
    public static void main(String[] args) {
        int []a={10,20,30,40,50};
        int []b={40,50,60,70,80};
        HashSet<Integer> hashSet=new HashSet<Integer>();
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<b.length;j++)
            {
                if(a[i]==b[j])
                {
                    hashSet.add(a[i]);
                }
            }
        }
        System.out.println(hashSet);

    }
}
