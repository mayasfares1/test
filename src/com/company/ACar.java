package com.company;

public abstract class ACar implements Car{

   protected String RegistrationNumber;
   final String Make;
   final String Model;
    final int NumberOfDoors;

    public ACar(String registrationNumber,String make, String model, int numberOfDoors) {
       this.RegistrationNumber = registrationNumber;
       this.Make = make;
       this.Model = model;
       this.NumberOfDoors = numberOfDoors;
    }


   @Override
   public String getRegistrationNumber() {
      return null;
   }

   @Override
   public String getMake() {
      return null;
   }

   @Override
   public String getModel() {
      return null;
   }

   @Override
   public int getNumberOfDoors() {
      return 0;
   }

   @Override
   public String toString() {
      return "ACar{" +
              "RegistrationNumber='" + RegistrationNumber + '\'' +
              ", Make='" + Make + '\'' +
              ", Model='" + Model + '\'' +
              ", NumberOfDoors=" + NumberOfDoors +
              '}';
   }
}
