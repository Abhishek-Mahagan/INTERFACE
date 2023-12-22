package com.mahagan.javalangpkg.stringvstringbuffer;

public class StringExample {
    public static void main(String[] args) {

        String s1=new String("abhi");
        String s2=new String("abhi");
        String s=s1;
        System.out.println(s==s1);
        System.out.println(s.equals(s1));
       System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        //the equal() method is overriden in the String class so it is used to contain comparision

        System.out.println("For StringBuilder operation");
        StringBuffer stringBuffer=new StringBuffer("abhi");
        StringBuffer stringBuffer1=new StringBuffer("abhi");
        StringBuffer stringBuffer2=stringBuffer;
        System.out.println(stringBuffer==stringBuffer2);
        System.out.println(stringBuffer==stringBuffer1);
        System.out.println(stringBuffer.equals(stringBuffer1));

    }
}

