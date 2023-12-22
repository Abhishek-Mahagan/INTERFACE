package com.mahagan.javalangpkg.stringbufferex.ensurecapacity;

public class EnsureCap
{
    public static void main(String[] args) {
        StringBuffer stringBuffer=new StringBuffer();
        System.out.println(stringBuffer.capacity());
        stringBuffer.ensureCapacity(1000);
        System.out.println(stringBuffer.capacity());
    }
}
