package com.corejava.pratice.constructor;

public class Constuct1 {
    Constuct1()
    {
        System.out.println("Hello Patna");
    }
    Constuct1(int p,int q)
    {
        int a=p;
        int b=q;
        System.out.println(p);
        System.out.println(q);
    }

    public static void main(String[] args) {
        new Constuct1();
        new Constuct1(10,15);
    }
}
