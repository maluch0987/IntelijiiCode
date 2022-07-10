package com.syntax.class23;

import java.util.Arrays;
import java.util.Scanner;

public class scaner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter size");
        int size = scan.nextInt();
        String[] arr = new String[size];
for(int i=0;i<arr.length;i++){
    arr[i]=scan.next();
    System.out.println(Arrays.toString(arr));
}

    }
}