package com.mahagan.collection.hashtable;

import java.util.Hashtable;

public class HashTableDemo
{
    public static void main(String[] args) {
        Hashtable hashtable=new Hashtable(30 );
        hashtable.put(new Temp(1),"A");
        hashtable.put(new Temp(5),"b");
        hashtable.put(new Temp(7),"c");
        hashtable.put(new Temp(17),"d");
        hashtable.put(new Temp(23),"e");
        System.out.println(hashtable);

    }
}
