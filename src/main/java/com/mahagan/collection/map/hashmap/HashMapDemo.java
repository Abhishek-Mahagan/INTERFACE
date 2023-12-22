package com.mahagan.collection.map.hashmap;

import java.util.*;

public class HashMapDemo
{
    public static void main(String[] args) {
        HashMap m=new HashMap();
        m.put("Abhi",101);
        m.put("ravi",333);
        m.put("surya",999);
        m.put("kohli",106);
        System.out.println(m);
       // System.out.println(m.put("Abhi",555));
        Set s=m.keySet();
        System.out.println(s);
        Collection c=m.values();
        System.out.println(c);
        Set s1=m.entrySet();
        System.out.println(s1);
        Iterator itr=s1.iterator();
        while (itr.hasNext())
        {
            Map.Entry m1=(Map.Entry)itr.next();
            if(m1.getKey().equals("Abhi"))
            {
                m1.setValue(1000);
            }
        }
        System.out.println(m);

    }
}
