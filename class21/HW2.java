package com.syntax.class21;

public class HW2 {




    /*
Create a class named 'Programming'. While creating an object of the class,
if nothing is passed to it, then the message "I love programming languages" should be printed.
If some String is passed to it, then in place of "programming languages" the value variable should be printed. Example,
if we pass "Java", then "I love Java" should be printed.
     */


 void printLn() {
        System.out.println("I love programing language");
    }

    void printLn(String a) {
        System.out.println("I love java");
    }

    public static void main(String[] args) {
        HW2 lan = new HW2();
        lan.printLn();
        lan.printLn("saj");
    }
}