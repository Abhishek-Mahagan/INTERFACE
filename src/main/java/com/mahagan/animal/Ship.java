package com.mahagan.animal;

public class Ship implements Animal
{
    @Override
    public void ColorType() {
        System.out.println("SHIP HAVING COLOR IS WHITE");
    }

    @Override
    public void NumOfLegs() {
        System.out.println("THE SHIP HAVING 4 legs");

    }

    @Override
    public void AppForPet() {
        System.out.println("NOT FOR PER");

    }
}
