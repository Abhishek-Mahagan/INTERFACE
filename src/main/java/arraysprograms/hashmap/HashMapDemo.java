package arraysprograms.hashmap;

import java.util.*;

public class HashMapDemo
{
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap=new HashMap<Integer,String>();
        hashMap.put(1,"Abhishek");
        hashMap.put(2,"Kanawade");
        hashMap.put(3,"sangamner");
        System.out.println(hashMap);
        Collection c=hashMap.values();
        System.out.println(c);
        Set s=hashMap.keySet();
        System.out.println(s);
        Set s2=hashMap.entrySet();
        System.out.println(s2);
        Iterator iterator=s2.iterator();
        while(iterator.hasNext())
        {
            Map.Entry m1=(Map.Entry)iterator.next();
            if(m1.getKey().equals(1))
            {
                m1.setValue("abs");
            }

        }
        System.out.println(hashMap);
    }
}
