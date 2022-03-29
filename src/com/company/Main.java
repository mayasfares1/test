package com.company;

public class Main extends FleetOfCars {

    static Car car;

    public Main() {
    }

    public static void main(String[] args) {

        Car car = new DieselCar("Honda","Honda","Civic",2,30,false);
        Car car1 = new ElectricCar(400,200,"SD346543","Renault","Zoe",2);
        Car car2 = new GasolineCar("DE564421","Mazda","6",4,19);

        Car car3 = new GasolineCar("23","Toyota","Corolla",5,25);
        FleetOfCars fleetOfCars = new FleetOfCars();
        fleetOfCars.addCar(car3);

        fleetOfCars.addCar(car);
        fleetOfCars.addCar(car1);
        fleetOfCars.addCar(car2);
        fleetOfCars.addCar(car3);
        System.out.println(fleetOfCars.toString());
        System.out.println(fleetOfCars.getTotalRegistrationFeeForFleet());


    }

}
