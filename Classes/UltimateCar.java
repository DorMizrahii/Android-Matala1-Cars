package Classes;

import Interfaces.iCar;

public class UltimateCar implements iCar{

	SunCar sunCar;
	GasolineCar gasolineCar;
	public UltimateCar(String companyName,int kilometers,int year,double energy,Boolean sunRoof) {
		this.sunCar = new SunCar(companyName,kilometers,energy,sunRoof);
		this.gasolineCar = new GasolineCar(companyName,kilometers,year);
	}
	

	
	public void carInfo() {
	    System.out.println("type: " + this.getClass().getSimpleName());
	    System.out.println("Kilometers: " + this.sunCar.getKilometrage());
        System.out.println("Year: " + this.gasolineCar.getYear());
        System.out.println("Energy: " + this.sunCar.getEnergy());
        System.out.println("sunRoof: " + this.sunCar.getSunRoof());
	}
}
