package day100.removedublicate;

import java.util.LinkedHashSet;
import java.util.Set;

public class abhi {
    public static void main(String[] args) {
        String s="java";
        Set<Character> charset=new LinkedHashSet<Character>();
        char ch[]=s.toCharArray();

        for(char a:ch)
        {
            charset.add(a);
        }
        System.out.println(charset);
        StringBuffer sb=new StringBuffer();
        for(char p:charset)
        {
            sb.append(p);
        }
        System.out.println(sb);

    }
}
