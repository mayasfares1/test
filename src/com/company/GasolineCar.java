package com.company;

public class GasolineCar extends AFuelCar {

   private int fee;

   public GasolineCar(String registrationNumber,String make, String model, int numberOfDoors, int kmPrLitre) {
      super(registrationNumber,make,model,numberOfDoors,kmPrLitre);
   }


   @Override
   public String getFuelType() {
      return "Gasoline";
   }

   @Override
   public int getRegistrationFee() {

      int i = 0;

      if (kmPrLitre >= 20 && kmPrLitre <= 50) {
         i = 330;
      }
      else if (kmPrLitre >= 15 && kmPrLitre <= 20){
         i = 1050;
      }

      else if(kmPrLitre >= 10 && kmPrLitre <=15){
         i = 2340;
      }

      else if(kmPrLitre >=5 && kmPrLitre <=10){
         i = 5500;

      } else if (kmPrLitre<=5){

         i = 10470;
      }
      return i;
   }

   @Override
   public String toString() {
      return "GasolineCar{" +
              "Make='" + Make + '\'' +
              ", Model='" + Model + '\'' +
              ", NumberOfDoors=" + NumberOfDoors +
              '}';
   }
}

