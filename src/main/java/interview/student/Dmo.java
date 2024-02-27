package interview.student;

import java.util.Scanner;

public class Dmo {
    public static void main(String[] args) throws InterruptedException
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        int arr_size=sc.nextInt();
        int a[]=new int[arr_size];
        for(int i=0;i<arr_size;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("The inpute array is");
        for(int i=0;i<arr_size;i++)
        {
            System.out.println(a[i]);
        }
        System.out.println("Enter the search elements");
        int search=sc.nextInt();
        int flag=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==search)
            {
                flag=1;
                System.out.println("The number is found=>"+a[i]);
            }


        }
        if(flag==0)
        {

                System.out.println("The number is not  found");


        }
    }

}
