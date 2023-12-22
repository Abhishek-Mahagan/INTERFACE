package com.mahagan.animal;

public class Cow implements Animal
{
    @Override
    public void ColorType() {
        System.out.println("COLOR IS BROWN");
    }

    @Override
    public void NumOfLegs() {
        System.out.println("NUMBER OF LEGS=4");

    }

    @Override
    public void AppForPet() {
        System.out.println("use for pet");

    }
}
