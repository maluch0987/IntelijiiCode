package com.syntax.class26;


import java.util.ArrayList;

public class Demo2 {
    public static void main(String[] args) {
        ArrayList<Character> arraylist=new ArrayList<>();
        arraylist.add('A');
        arraylist.add('B');//adds the element to an arraylist
        arraylist.add('C');
        arraylist.add('D');
        System.out.println(arraylist);
        System.out.println(arraylist.get(2));//gets back the element from the list
        for (int i=0;i<arraylist.size();i++){
            System.out.println(arraylist.get(i));
        }
    }
}
