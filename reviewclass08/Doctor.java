package com.syntax.reviewclass08;

public class Doctor {
   public String firstName,lastName;
   protected String speciality;
    int experience;
   private double salary;

   public static String hospital;
    public Doctor(String firsName, String lastName){
      this.firstName=firsName;
      this.lastName=lastName;
    }
    Doctor(String firstName,String lastName,String speciality,int experience){
        this(firstName,lastName);
        this.speciality=speciality;
        this.experience=experience;
    }
    public void printInfo(){
        System.out.println("Doctor name is "+firstName+" "+lastName+" and speciality is "+speciality);



    }
    protected void work(){
        System.out.println("Doctor "+lastName+" works at "+ hospital);

    }
    void treat(String patientName){
        printInfo();
        System.out.println("Treats patient "+patientName);
    }
    private  void getPay(){
        System.out.println("Doctor");
    }


    //static methods can work only with static variables
    public static void study(String university) {
        //PrintInfo(): CE:Cannot make a static reference
        System.out.println("Doctor  studied at "+university+" and now workat "+hospital);
    }




}
