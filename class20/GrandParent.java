package com.syntax.class20;

import javax.swing.plaf.basic.BasicRadioButtonMenuItemUI;

public class GrandParent {
    String name="Anyatullah";

}
class Parent extends GrandParent{
    void printInfo(){
        System.out.println("Name of my father is "+name);

    }
}
class Child extends Parent{
    void printInfo(){

        System.out.println("NAme of my Grandpa is "+name);
    }
}
class GrandChild extends Child{
    void printInfo(){

        System.out.println("My grand grand fathers name is "+name);
    }

    public static void main(String[] args) {
        GrandChild grandChild=new GrandChild();
        grandChild.printInfo();
    }
}