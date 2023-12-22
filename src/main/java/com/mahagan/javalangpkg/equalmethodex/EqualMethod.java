package com.mahagan.javalangpkg.equalmethodex;

import java.util.Objects;

public class EqualMethod
{
    int roll;
    String name;
    EqualMethod(int roll,String name)
    {
        this.roll=roll;

        this.name=name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EqualMethod that = (EqualMethod) o;
        return roll == that.roll && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roll, name);
    }

    public static void main(String[] args) {
        EqualMethod equalMethod=new EqualMethod(101,"abhi");
        EqualMethod equalMethod1=new EqualMethod(102,"kanawade");
        EqualMethod equalMethod2=new EqualMethod(101,"abhi");
        EqualMethod equalMethod3=equalMethod;
        System.out.println(equalMethod.equals(equalMethod1));
        System.out.println(equalMethod.equals(equalMethod2));
        System.out.println(equalMethod.equals(equalMethod3));
        System.out.println(equalMethod.equals("abhi"));
        System.out.println(equalMethod.equals(null));
    }
}
