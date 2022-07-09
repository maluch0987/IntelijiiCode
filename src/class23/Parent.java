package class23;

import java.util.concurrent.Callable;

public class Parent {
    public static void eat(){
        System.out.println("I like to eat seafood");
    }
    public static void sleep() {
        System.out.println("I like to sleep 8 hours");
    }
    public static void activity(){
        System.out.println("Go tu beach");
    }


}
class Child extends Parent{
    public static void activity() {
        System.out.println("I am very religius");
    }

}
class ParentTester{
    public static void main(String[] args) {



       Child.sleep();
        Child.activity();


        Parent.activity();
        Child.activity();



    }
}