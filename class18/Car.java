package com.syntax.class18;

import javax.swing.*;
import java.security.PublicKey;

public class Car {
    String make;
    String  model;
    String  color;
public Car(){

}

    public Car(String carMake, String carModel,String carColor){
        make=carMake;
        model=carModel;
        color=carColor;}

public  Car(String carModel){
    model=carModel;
}
  void printCarModel(){
      System.out.println("Model "+model);
  }
    void printInfo(){
        System.out.println("Make "+make+"Model "+model+"Color "+color);
    }
}
