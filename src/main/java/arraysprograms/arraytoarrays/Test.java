package arraysprograms.arraytoarrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Array To ArrayList In Java :
a) Using Arrays.asList() Method :*/
public class Test
{
    public static void main(String[] args) {
        String a[]={"Abhi","kanawade","sangamner","rahul"};
        for(String a1:a)
            System.out.println(a1);
         List list =Arrays.asList(a);
        System.out.println(list);
        a[0]="Ashok";
        System.out.println(list);

    }
}
