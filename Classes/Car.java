package Classes;

import Interfaces.iCar;

public abstract class Car implements iCar{

	protected String companyName;
	protected int kilometrage;

	public Car(String i_companyName, int kilometrage) {
		this.companyName = i_companyName;
		this.kilometrage = kilometrage;
	}

	public String getCompanyName(){
		return this.companyName;
	}

	public void setCompanyName(String i_companyName) {
		this.companyName = i_companyName;
	}

	public int getKilometrage() {
		return kilometrage;
	}

	public void carInfo() {
	    System.out.println("Car type: " + this.getClass().getSimpleName());
	    System.out.println("Kilometers: " + this.kilometrage);
	}
}