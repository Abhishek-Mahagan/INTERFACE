

package arraysprograms.contentcheckstringarray;

import java.util.Arrays;

public class Test
{
    public static void main(String[] args) {
        String[] s1={"Abhi","Yash","SHUBHAM"};
        String[] s2={"Abhi","Yash","SHUBHAM"};
        System.out.println(Arrays.equals(s1,s2));

        if(Arrays.equals(s1,s2)==true)
        {
            System.out.println("Strings are equals");

        }
        else
        {
            System.out.println("String is not equals");
        }
    }
}
