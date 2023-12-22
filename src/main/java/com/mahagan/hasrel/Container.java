package com.mahagan.hasrel;

public class Container
{
    public static void main(String[] args) {
        Toys toys=new Toys(10,"RED",25,250.23,"HP");
        System.out.println("Package Color "+toys.getColor());
        System.out.println("Package Name "+toys.getCompName());
        System.out.println("Package Date "+toys.getMagDate());
        System.out.println("Package Id "+toys.getPackId());
        System.out.println("Package Price "+toys.getPrice());

        Toys toys1=new Toys(11,"WHITE",26,1000.2,"DELL");



    }


}
