package com.syntax.class27;

import java.util.AbstractList;
import java.util.ArrayList;

public class ListDemo3 {
    public static void main(String[] args) {
        AbstractList<String>legends=new ArrayList<>();//2DArrayList
        legends.add("Hamid");
        legends.add("Karla");
        legends.add("Naveed");
        legends.add("Tara");
        legends.add("Yusuf");
        legends.add("Yusuf");
        System.out.println(legends.get(4));
        System.out.println(legends.get(2));
        System.out.println(legends);
        legends.set(0,"Hamid Jan");//replace an index
        System.out.println(legends);

        System.out.println(legends.indexOf("Yusuf"));
        System.out.println(legends.lastIndexOf("Yusuf"));
        System.out.println(legends.subList(0,3));
    }
}
