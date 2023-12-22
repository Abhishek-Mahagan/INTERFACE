package com.mahagan.interviewoftostring.removeallspaces;

public class Test {
    public static void main(String[] args) {
        String str="   abhishek    kanawade  ";
        System.out.println(str.trim());
        System.out.println(str.replaceAll(" ", ""));
    }
}
