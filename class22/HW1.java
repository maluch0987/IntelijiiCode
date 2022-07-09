package com.syntax.class22;

public class HW1 {
    /*
    Create a class 'Degree' having a method 'getPrerequisite' that prints
     ""To get a degree you need high school diploma"".
Class 'Degree' has 2 subclasses namely 'Bachelors' and Masters’.
In Masters class override method 'getPrerequisite'.
Call the method by creating an object of each of the three classes.
     */
}
class Degree{
     void  getPrerequisite(){
        System.out.println("To get a degree you need high schole diploma");
    }
    static class Bachelors extends Degree{

    }
     static class Masters extends Degree{

    }

    public  static void main(String[] args) {
      Bachelors masters=new Bachelors();
        masters.getPrerequisite();
        Masters m=new Masters();
        m.getPrerequisite();
        Degree a=new Degree();
        a.getPrerequisite();
    }
}
