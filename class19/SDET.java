package com.syntax.class19;

public class SDET extends Human {
    boolean goodWithJava;
    SDET(String name,String eyeColor,String job,int age,boolean goodWithJava){
      this.name=name;
      this.eyeColor=eyeColor;
      this.job=job;
      this.age=age;
      this.goodWithJava=goodWithJava;

    }
    void printInfo(){
        System.out.println("my name ia "+name+" i do "+job+" am i good with Java "+goodWithJava);
    }

    public static void main(String[] args) {
        SDET sdet=new SDET("Samer","black","Gym",22,true);
        sdet.printInfo();
    }
}
