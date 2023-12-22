package com.mahagan.overloading.AniamlOverr;

public class Testing
{
    public void m1(Animal a)
    {
        System.out.println("I am in animal class");
    }
    public void m1(Monkey m)
    {
        System.out.println("i am in the Monkey class");
    }

    public static void main(String[] args) {
        Testing testing=new Testing();
        Animal animal=new Monkey();
        testing.m1(animal);
        //in the overloading the method resolution is always takes care by complier on ref type;
    }
}
