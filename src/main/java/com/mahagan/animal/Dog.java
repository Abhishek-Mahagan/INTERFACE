package com.mahagan.animal;

public class Dog implements Animal{
    @Override
    public void ColorType() {
        System.out.println("Dog color is white");
    }

    @Override
    public void NumOfLegs() {
        System.out.println("DOGS HAVING 2 Legs");

    }

    @Override
    public void AppForPet() {
        System.out.println("YES FOR PET");

    }
}
