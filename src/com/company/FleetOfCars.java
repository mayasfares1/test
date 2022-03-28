package com.company;

import java.util.ArrayList;

public class FleetOfCars {
    ArrayList<Car> fleet = new ArrayList<>();

    public void addCar(Car car)
    {
        fleet.add(car);
    }
    public int getTotalRegistrationFeeForFleet()
    {
        int total = 0;
        for(Car car1: fleet) {
            total = car1.getRegistrationFee() + total;
        }
        return total;
    }

    @Override
    public String toString()
    {
        String total = " ";
        for(Car car1: fleet){
            total = total + car1.toString()+"\n";
        }
        return total;

    }

}

