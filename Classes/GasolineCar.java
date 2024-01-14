package Classes;

import Interfaces.iCar;

public class GasolineCar extends Car implements iCar{
	private int year;

	public GasolineCar(String companyName, int kilometers, int year) {
		super(companyName, kilometers);
		this.year = year;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
    public void carInfo() {
        super.carInfo();
        System.out.println("Year: " + this.year);
    }
    
    public void avgGas() {
    	double avgGas = this.year / this.kilometrage;
    	System.out.println("The average gas is " + avgGas);
    }
}
