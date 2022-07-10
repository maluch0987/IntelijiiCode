package com.syntax.class27;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayVsLinkList {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>();
        long startTime=System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            names.add(0,"Captain Naveed Major");
        }
        long endTime=System.currentTimeMillis();
        System.out.println(endTime-startTime);
    }

}