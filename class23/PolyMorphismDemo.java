package com.syntax.class23;

public class PolyMorphismDemo {

    void doSomething(String name){
        System.out.println("Downloading a movie from the internet "+name);
    }
    void doSomething(int num){
        System.out.println("calculating the next based on new rules");
    }

}
class PolyTester{
    public static void main(String[] args) {
        PolyMorphismDemo p=new PolyMorphismDemo();
        p.doSomething(10);
    }
}