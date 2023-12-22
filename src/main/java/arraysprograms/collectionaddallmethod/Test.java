package arraysprograms.collectionaddallmethod;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Test
{
    public static void main(String[] args)
    {
        String[] s1={"Abhishek","Siddharth","Krushana","kanawade"};
        Collection collections= (Collection) Arrays.asList(s1);
        System.out.println(collections);


    }
}
