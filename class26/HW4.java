package com.syntax.class26;

import java.util.ArrayList;

public class HW4 {
    public static void main(String[] args) {
        /*
         Create an arrayList of even numbers from 1 to 500. Remove any number that is divisible by 5 from that arrayList.
         */
        ArrayList<Integer>num=new ArrayList<>();
        for(int i=0;i<500;i++){
       num.add(i);

            }
        for(int a=0;a< num.size();a++){
            if(num.get(a)%5==0)
                num.remove(a) ;

            }


        System.out.println(num);
    }
}
