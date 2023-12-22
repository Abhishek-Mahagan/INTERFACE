package com.mahagan.javalangpkg.stringbufferex.deleteoperation;

public class DeleteOperation
{
    public static void main(String[] args) {
        StringBuffer stringBuffer=new StringBuffer("Abhishek");
        stringBuffer.delete(2,8);
        System.out.println(stringBuffer);
        stringBuffer.deleteCharAt(0);
        System.out.println(stringBuffer);
    }
}
