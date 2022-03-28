package com.company;

abstract class AFuelCar extends ACar {

    protected int kmPrLitre;
    protected String FuelType;

    public AFuelCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre) {

        super(registrationNumber,make,model,numberOfDoors);
        this.kmPrLitre = kmPrLitre; // initalising
    }
    public abstract String getFuelType();


    int getKmPrLitre(){
           return kmPrLitre;
    }

   @Override
    public String toString()
   {
       return null;
   }


}
