package arraysprograms.hashmap.duplicate;

import java.util.*;

public class DuplicateHashMap
{
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap=new HashMap<Integer,String>();
        hashMap.put(1,"Abhishek");
        hashMap.put(2,"Kanawade");
        hashMap.put(3,"Sangamner");
        hashMap.put(4,"maharashtra");
        hashMap.put(5,null);
        System.out.println(hashMap);
        hashMap.putIfAbsent(1,"Rahul");
        hashMap.putIfAbsent(5,"Pune");
        System.out.println(hashMap);
        Set list=hashMap.entrySet();
        Iterator iterator=list.iterator();
        while(iterator.hasNext())
        {
            Map.Entry m=(Map.Entry)iterator.next();
            if(m.getKey().equals(2))
            {
                m.setValue("kohli");
            }
        }
        System.out.println(hashMap);

        /*to get hashmap values*/
      String  s=hashMap.get(2);
        System.out.println(s);

        /*to find keys value */
        System.out.println(hashMap.containsKey(2));
        System.out.println(hashMap.containsKey(9));
        System.out.println(hashMap.containsKey(5));
    }
}
