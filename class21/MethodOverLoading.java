package com.syntax.class21;

public class MethodOverLoading {

   static void add(int number1,int number2){
        System.out.println(number1+number1);
    }
    static void addDouble (double number1,double number2) {
        System.out.println(number1 + number1);
    }
    static void add3Double (double number1,double number2,double number3) {
        System.out.println(number1 + number1);
    }

    public static void main(String[] args) {
        add(20,20);
        addDouble(20.5,20.6);
        add3Double(23,86,32);
    }
}
