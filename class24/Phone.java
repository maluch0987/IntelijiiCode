package com.syntax.class24;

public abstract class Phone {

    abstract  void displayPictures();
    abstract void unlock();


    }
class Iphone extends Phone{
    void displayPictures(){
        System.out.println("use the Photos app to display the pictures");
    }
    void unlock(){
        System.out.println("use FaceId to unlock the phone");
    }
}
 class Samsung extends Phone{
     @Override
     void displayPictures() {
         System.out.println("use the photos app to display the pictures");
     }

     @Override
     void unlock() {
         System.out.println("user finger print sensor or face unlock to unlock your");
     }
 }
class Tester{
    public static void main(String[] args) {
        Samsung samsung=new Samsung();
        samsung.displayPictures();

        }
    }
