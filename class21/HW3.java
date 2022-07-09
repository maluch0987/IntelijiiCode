package com.syntax.class21;

public class HW3 {


    /*
        Create 1 class with a static method that has 3 overloaded forms.
        Then call each overloaded method with specific arguments and observe result.
         */


static void overLoad(int a){
    System.out.println("1 form");

}
    static void overLoad(int w,int s){
        System.out.println("2 form");
    }
    static  void overLoad(int r,double a,String s){
        System.out.println("3 form");
    }

    public static void main(String[] args) {
        HW3 a=new HW3();
        a.overLoad(2);
        a.overLoad(3,3);
        a.overLoad(2,34.3,"java");


    }


}

