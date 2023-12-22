package com.mahagan.javalangpkg.tostringex;

public class Test
{
    int rollNo;
    String name;
    Test(int rollNo,String name)
    {
        this.rollNo=rollNo;
        this.name=name;

    }
    public String toString()
    {
        return "Rollno is "+ rollNo+"\n"+"the name is"+name;
    }
    public static void main(String[] args) {
        Test test=new Test(2,"Abhi");
    System.out.println(test);

    }
}
