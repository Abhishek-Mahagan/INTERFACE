package com.mahagan.interviewoftostring.findreaptedstring;

public class Test
{
    public static void main(String[] args) {
        String[] str={"Java","Spring","Java","SpringBoot","Spring"};
        for(int i=0;i<str.length;i++)
        {
            int count=1;
            for(int j=i+1;j<str.length;j++)
            {
                if(str[i].equalsIgnoreCase(str[j]))
                {
                    count++;
                }
            }
            if(count>1)
            {
                System.out.println(str[i]+"  Cont is  =>"+count);
            }
        }
    }
}
