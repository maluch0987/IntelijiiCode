package com.syntax.class18;

import java.util.concurrent.Callable;

public class CarTester {
    public static void main(String[] args) {

        Car car1=new Car(" Audi "," Etron GT "," Black");
        car1.printInfo();
        Car car2=new Car("Toyota "," Corola "," White");
        car2.printInfo();

Car car=new Car("Tesla");
car.printCarModel();

    }
}
