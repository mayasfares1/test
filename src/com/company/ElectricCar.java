package com.company;

public class ElectricCar extends ACar{

 private int batteryCapacity;
 private int maxRange;
 private int kmPrLitre = 0;
 private int whPrKm;
 private int RegistrationFee;



 public ElectricCar(int batteryCapacity, int maxRange,String registrationNumber,String make,String model,int numberOfDoors)

 {
   super(registrationNumber,make,model,numberOfDoors);
   this.batteryCapacity = batteryCapacity;
   this.maxRange = maxRange;

 }


public int getBatteryCapacityKWh()
{
 return 0;
}

public int getMaxRangeKm()
{
 return 0;
}

public int getWhPrKm()
{
 return batteryCapacity/maxRange;
}

public double getkmPrLitre()
{
  return (getWhPrKm()/91.25)/100;
}

// return (batteryCapacity*1000)/maxrange
 // int kmPrL = ((100/(getWhprKm())/91.25)+0.5);

 public int getRegistrationFee() {




  if (kmPrLitre >= 20 && kmPrLitre <= 50) {
   RegistrationFee = 330;
  }
  else if (kmPrLitre >= 15 && kmPrLitre <= 20){
   RegistrationFee = 1050;
  }

  else if(kmPrLitre >= 10 && kmPrLitre <=15){
   RegistrationFee = 2340;
  }

  else if(kmPrLitre >=5 && kmPrLitre <=10){
   RegistrationFee = 5500;

  } else if (kmPrLitre<=5){

   RegistrationFee = 10470;
  }
  return RegistrationFee;

 }





 @Override
 public String toString() {
  return "ElectricCar{" +
          "BatteryCapacity"+ batteryCapacity + '\''+
          "maxRange" + maxRange +'\''+
          "Make='" + Make + '\'' +
          ", Model='" + Model + '\'' +
          ", NumberOfDoors=" + NumberOfDoors +
          '}';
 }

}
