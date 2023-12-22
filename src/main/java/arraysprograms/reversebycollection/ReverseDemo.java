package arraysprograms.reversebycollection;

import java.io.FilterOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.*;

public class ReverseDemo
{
    public static void main(String[] args) {
        int []a={1,2,3,4,5,6,7,8};
        int l=a.length/2;
        int temp=0;
        for(int i=0;i<l;i++){
            temp=a[i];
            a[i]=a[a.length-1-i];
            a[a.length-1-i]=temp;
        }
       for(int a1:a)
       {
           System.out.println(a1);
       }

    }

}
