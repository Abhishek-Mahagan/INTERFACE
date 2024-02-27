package interview.techno;

public class Demo {
    public static void main(String[] args) {

        int a[]={30,80,50,30};
        int max=a[0];
      for(int i=0;i<a.length;i++)
      {

          if(max<a[i])
          {
              max=a[i];
          }
      }
        System.out.println(max);
    }

}
