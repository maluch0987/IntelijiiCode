package com.syntax.class22;

public class HW2 {
    /*
    Create a class CreditCard and define variable balance and interest.
    Create an instance method that will calculate interest based on the given balance.
Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
Call the method by creating an object of each of the three classes.
     */
}
class CreditCard{
    double balance;
    double interest;
void calculate(double balance,double interest){
    this.balance=balance;
    this.interest=interest;
    System.out.println( balance*(interest/100));
}
}
  class Visa extends CreditCard{

}
class Ax extends CreditCard{


    public static void main(String[] args) {

       Visa visa = new Visa();
visa.calculate(467888,2.9);
Ax ax=new Ax();
ax.calculate(350000,2.9);
    }
}
