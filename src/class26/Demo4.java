package class26;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo4 {
    public static void main(String[] args) {
        ArrayList<String>names =new ArrayList<>();
        names.add("zamer");
        names.add("Kelvin");
        names.add("kolya");
        names.add("Samanta");
        System.out.println(names);
      names.remove("kolya");
        System.out.println(names);
        names.remove(2);
        System.out.println(names);
    }
}
