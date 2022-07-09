package review08_01;

import com.syntax.reviewclass08.Doctor;

public class Practice extends Doctor {
    Practice(String firsName,String lastName){
        super(firsName,lastName);
    }

    public static void main(String[] args) {
        Doctor doc=new Doctor("John","Smith");
        doc.printInfo();

    }
}
