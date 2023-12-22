package com.mahagan.javalangpkg.stringbufferex.insert;

public class StringBufferEx
{
    public static void main(String[] args) {
        StringBuffer stringBuffer=new StringBuffer( );
        System.out.println(
                stringBuffer.capacity( ));
        stringBuffer.append("PI value");
        stringBuffer.append(3.14);
        stringBuffer.append("Abhi");
        System.out.println(stringBuffer);
    }
}
