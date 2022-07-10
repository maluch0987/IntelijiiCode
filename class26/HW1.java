package com.syntax.class26;

import java.util.ArrayList;

public class HW1 {
    public static void main(String[] args) {
        /*
        Create an arraylist of cars and retrieve all the values using 3 different ways.
         */
        ArrayList<String> car=new ArrayList<>();
        car.add("BMW");
        car.add("Audi");
        car.add("VW");
        System.out.println(car);
for(int i=0;i<car.size();i++){
    System.out.println(car.get(i));
}
for(String a:car){
    System.out.println(a);
}
    }
}
