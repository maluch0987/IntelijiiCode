package com.syntax.reviewclass08;

public class AnotherHospital {
    public static void main(String[] args) {
        Doctor doc=new Doctor("Sherlock","Holms","Magic",10);
        //access methods to test visibility
        doc.printInfo();//access public
        doc.treat("Samanta");//access to default
        doc.work();//access to protect
        Doctor.study("GW");//access to public
    }
}
