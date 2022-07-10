package com.syntax.class26;

import java.util.ArrayList;

public class HW3 {
    public static void main(String[] args) {
        /*
        Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.
         */
        ArrayList<String>drinks=new ArrayList<>();
        drinks.add("Coca");
        drinks.add("Pepsi");
        drinks.add("RedBull");
        drinks.add("Monster");
        for(int i=0;i< drinks.size();i++){
            if(drinks.get(i).contains("a")||drinks.get(i).contains("e")){
                drinks.remove(i);
                drinks.add(i,"water");
            }
        }
        System.out.println(drinks);
    }
}
