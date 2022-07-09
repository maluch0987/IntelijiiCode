package com.syntax.class21;

public class HW1 {
    /*
    Create 1 class in which create a methods that will calculate the area (volume in case of box) of
Rectangle
Square
Box
     */
    void calculateArea(int x){
        System.out.println("The area of sguare is "+x*x);
    }
    void calculateArea(double x,double y){
        System.out.println("The area of rectangle is "+x*y);
    }
    void calculateArea(double x,double u,double w){
        System.out.println("The area of box is "+x*u*w);
    }

    public static void main(String[] args) {
        HW1 s=new HW1();
        s.calculateArea(3);
        s.calculateArea(2,5);
        s.calculateArea(3,4,5);
    }
}
