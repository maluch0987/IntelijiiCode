package com.syntax.reviewclass08;

import javax.print.Doc;

public class Hospital {
    public static void main(String[] args) {
        Doctor doc=new Doctor("jane","Smith");
        System.out.println(doc.firstName);
        System.out.println(doc.lastName);
        doc.printInfo();
        Doctor.hospital="UCSF";
        doc.work();
        Doctor doctor=new Doctor("Joe","Doe","cardiologystr",10);
        doctor.printInfo();
        doctor.work();
//changing value of static variable
        Doctor.hospital="George Washington";
        doctor.work();
        doc.work();

        doc.lastName="Obama";
        doc.printInfo();
        doctor.printInfo();


        doc.hospital="Mayo Clinic";

        doc.work();
        doctor.work();

   doctor.treat("Samanta");

   //accessing static method
        doctor.study("GTY");



    }
}
