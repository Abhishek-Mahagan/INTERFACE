package interview.Rheal;

// Prime number

import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r;
        int temp=n;
        int add=0;
        while(n!=0)
        {
            r=n%10;
            add=add*10+r;
            n=n/10;


        }


    }
}