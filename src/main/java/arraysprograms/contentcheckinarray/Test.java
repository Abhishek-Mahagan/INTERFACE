
/*3) Write a Java program to check the equality of two arrays?*/
package arraysprograms.contentcheckinarray;

public class Test
{
    public static void main(String[] args) {
        int []a={1,3,3,4};
        int []b={1,2,3,4};
        int flag=0;
        int count=0;
      for(int i=0;i<a.length;i++)
      {

          for (int j=i;j<=i;j++)
          {
              if(a[i]==b[j])
              {
                  count++;

              }
            if(count==a.length)
            {
              System.out.println("Same Arrays");
              flag=1;
            }

          }
          System.out.println("The size of array=>"+a.length);
          System.out.println("The number count=>"+count);

      }
      if(flag==0)
      {
          System.out.println("Not same arrays");
      }

    }
}
