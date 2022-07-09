package com.syntax.class21;

public class HW4 {
/*
Create 1 class with a private method that has 3 overloaded forms.
Then call each overloaded method with specific arguments and observe result.
white_check_mark
eyes
raised_hands
 */
    private void over(String a,String b,String d){
        System.out.println("Java 1");
    }
    private void over(String d){
        System.out.println("Java 2");
    }
    private void over(String e,String a){
        System.out.println("Java 3");
    }

    public static void main(String[] args) {
        HW4 sd=new HW4();
        sd.over("white","chek","mark");
        sd.over("eues");
        sd.over("raised","hands");
    }
}
