package com.syntax.class26;

import java.util.ArrayList;

public class HW2 {
    public static void main(String[] args) {
/*
Create an arrayList of words. Remove every word that ends with “e”
 */

        ArrayList<String>word=new ArrayList<>();
        word.add("Compile");
        word.add("Dad");
        word.add("Same");
        word.add("Class");
        for(int i=0;i< word.size();i++){
          if( word.get(i).endsWith("e")){
              word.remove(word.get(i));

          }
        }
        System.out.println(word);


    }}
