package arraysprograms.collectionsreverse;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseDemo
{
    public static void main(String[] args) {
        Integer []a={1,2,3,4,5,6,7,8,9};
        List<Integer> list=Arrays.asList(a);
        Collections.reverse(list);
        System.out.println(list);
    }
}
