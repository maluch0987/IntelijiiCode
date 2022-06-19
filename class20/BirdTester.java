package com.syntax.class20;

public class BirdTester {
    public static void main(String[] args) {
        Parrot parrot=new Parrot("parrot","Black",23,12);
        parrot.printInfo();

        Sparrow sparrow=new Sparrow("Jack","White",10,5);
       sparrow.printInfo();
    }
}
