package com.company;

class DieselCar extends AFuelCar {

    private int kmPrLitre;
    private int RegistrationFee;
    private boolean hasParticleFilter;

    public DieselCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre, boolean hasParticleFilter) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
        this.hasParticleFilter=hasParticleFilter;
    }



    @Override
    public int getRegistrationFee() {
        int i = 0;
        int j = 0;
        int y = 0;
        int k = 1000; // Partikeludledningsafgift

        if (kmPrLitre >= 20 && kmPrLitre <= 50) {
            i = 330;
            j = 130;

        } else if (kmPrLitre >= 15 && kmPrLitre <= 20) {
            i = 1050;
            j = 1390;
        } else if (kmPrLitre >= 10 && kmPrLitre <= 15) {
            i = 2340;
            j = 1850;
        } else if (kmPrLitre >= 5 && kmPrLitre <= 10) {
            i = 5500;
            j = 2770;

        } else if (kmPrLitre <= 5) {

            i = 10470;
            j = 15260;
        }
        if (hasParticleFilter) {
            return i + j;
        } else {
                return i+j+k;
            }
        }





        @Override
        public String getFuelType() {
            return "Diesel";
        }

    @Override
    public String toString() {
        return "DieselCar{" +
                "Make='" + Make + '\'' +
                ", Model='" + Model + '\'' +
                ", NumberOfDoors=" + NumberOfDoors +
                '}';
    }
}
