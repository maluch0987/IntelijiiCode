package com.syntax.class26;
class SD{

}
public interface Shape {

    /*
    Create an Interface 'Shape' with undefined methods
     as calculateArea and calculatePerimiter. Create 2 classes Circle & Square
     that implements functionality defined in the Shape Interface. Test your code.
*/
    void calculateArea();
    void calculatePerimiter();

}
class Circle implements Shape{

    @Override
    public void calculateArea() {
        System.out.println("Area of circle"+3.14*12);
    }
    @Override
    public void calculatePerimiter() {
        System.out.println  ("Perimiter of circle"+2*3.14*12) ;
    }
}
class Squar implements Shape{
    @Override
    public void calculateArea() {
        System.out.println("Area of Square"+3*12);
    }
    @Override
    public void calculatePerimiter() {
        System.out.println  ("Perimiter of circle"+2+2+3+3) ;
    }
    class TestShape{
        public static void main(String[] args) {
Circle circle=new Circle();
    circle.calculateArea();
    circle.calculatePerimiter();
    Squar squar=new Squar();
    squar.calculateArea();
    squar.calculatePerimiter();
}
        }

    }

