package com.syntax.reviewclass08_01;



class Main  implements MyInterface{
    @Override
    public void method1() {
        System.out.println("implementation of method1");
    }

    @Override
    public void method2() {
        System.out.println("implementation of method12");
    }

    public static void main(String[]args) {
        MyInterface sd = new MyInterface() {
            @Override
            public void method1() {

            }

            @Override
            public void method2() {

            }
        };


        sd.method1();
        sd.method2();
        }
    }

interface MyInterface {
    void method1();

    void method2();
}