package com.mahagan.collection.treemap.customerizedsorting;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo2
{

   /* using comparator we use the customized sorting order of the TreeMap
    we insert both the homogeneous and heterogeneous entries into the TreeMap*/
    public static void main(String[] args) {
        TreeMap treemap=new TreeMap(new MyTreeSet());
        treemap.put(101,"Abhishek");
        treemap.put(102,"Kanawade");
        treemap.put("www","102");
        treemap.put("Abhishekkanawade","sanganmer");
        System.out.println(treemap);

    }


}
