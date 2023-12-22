package arraysprograms.hashmapnewprogram;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo
{
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap=new HashMap<Integer,String>();
        hashMap.put(1,"Abhishek");
        hashMap.put(2,"kanawade");
        hashMap.put(3,"Nayan");
        System.out.println(hashMap);
        Set set=hashMap.entrySet();
        Iterator iterator=set.iterator();
        while (iterator.hasNext())
        {
            Map.Entry m1=(Map.Entry)iterator.next();
            if(m1.getKey().equals(1))
            {
                m1.setValue("PPPPPP");
            }
        }
        System.out.println(hashMap);

    }
}
