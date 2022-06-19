package com.syntax.class19;

public class Task5 {
    /* Write a java Class Students that have a constructor
which takes students name and 3 subject grades.
Inside your class also have a method to Calculate Average Grade.
Test Student class for 5 different students with different marks.
Your program should print an average mark of each students name.
NOTE: please use different names for instance and local variables. */
    public static void main(String[] args) {
        Student student=new Student("Best Student Ozkhan ",99,98,95);
        student.calculateAvgGrade();
        Student student2=new Student("Bad Ommar ",55,78,99);
        student2.calculateAvgGrade();
    }
}
