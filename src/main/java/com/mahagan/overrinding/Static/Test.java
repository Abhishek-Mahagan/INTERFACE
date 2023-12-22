package com.mahagan.overrinding.Static;

public class Test
{
    public static void main(String[] args) {
        Parent parent=new Child();
        Child child=new Child();
        child.marry();
        parent.marry();
        child.properties();


    }
}
