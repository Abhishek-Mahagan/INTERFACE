package com.mahagan.javalangpkg.hashcodeex;

public class HashCodeExample
{
    int i;
    HashCodeExample(int i)
    {
        this.i=i;
    }
    public String toString()
    {
        return i+"";
    }
    public int hashCode()
    {
        return i;
    }

    public static void main(String[] args) {
        HashCodeExample hashCodeExample=new HashCodeExample(10);
        HashCodeExample hashCodeExample1=new HashCodeExample(100);
        System.out.println(hashCodeExample);
        System.out.println(hashCodeExample1);
    }

}
