package com.syntax.class24;

public class Task {
   /*
Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
Define common behavior within parent class and override some of the methods in child classes
Define some methods specific to child classes
Write example of achieving run time polymorphism
 */
}
class Student{
    void study(){
        System.out.println("Students must study");
    }
    void doHomeWork(){
        System.out.println("Student should do homeworks");
    }
    void practice(){
        System.out.println("Students should practice");
    }
}
class SyntaxStudent extends Student{

    @Override
    void study() {
        super.study();
        System.out.println("Syntax student learn programing");
    }

    @Override
    void doHomeWork() {
        super.doHomeWork();
    }

    @Override
    void practice() {
        super.practice();
    }
}
class CollegeStudent extends Student{
    @Override
    void study() {
        super.study();
    }

    @Override
    void doHomeWork() {
        super.doHomeWork();
    }

    @Override
    void practice() {
        super.practice();
    }
}
class SchoolStudent extends Student {
}