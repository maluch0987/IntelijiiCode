package com.syntax.class18;

public class Cow {
    String breed;
    String color;
    int age;
    double weight;

    Cow(String Breed,String Color,int age,double weight ){
      this.breed=Breed;
      this.color=Color;
      this.age=age;
      this.weight=weight;




    }
    String printCowInfo(){
        return " Breed "+breed+" Color "+color+" Age "+age+" weight "+weight;

    }
}
