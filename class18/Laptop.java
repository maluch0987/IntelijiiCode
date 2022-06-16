package com.syntax.class18;

public class Laptop {
    String  name;
    String model;
    String storage;
    String  memory;
    double screen;
    public Laptop(){
        System.out.println("Basic construction is happening...");
    }
    public Laptop(String name, String model) {
        this.name = name;
        this.model = model;
    }
    public Laptop(String name, String model, String storage) {
    this.name = name;
    this.model = model;
    this.storage = storage;
}
    public Laptop(String name, String model, String storage, String memory, double screen) {
       /* this.name = name;
        this.model = model;
        this.storage = storage;*/
        this(name, model, storage);
        this.memory = memory;
        this.screen = screen;
    }

    public static void main(String[] args) {
        Laptop apple=new Laptop("Apple","M1Pro","512","16",32.2);
    }
}
