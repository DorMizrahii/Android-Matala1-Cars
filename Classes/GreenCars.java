package Classes;

import Interfaces.iCar;

public abstract class GreenCars extends Car{
	double energy;
	Boolean sunRoof;
	
	public GreenCars(String companyName, int kilometers,double energy,Boolean sunRoof) {
		super(companyName, kilometers);
		this.energy = energy;
		this.sunRoof = sunRoof;
	}

	public double getEnergy() {
		return energy;
	}

	public void setEnergy(double energy) {
		this.energy = energy;
	}
	
    public Boolean getSunRoof() {
        return sunRoof;
    }

    public void setSunRoof(Boolean sunRoof) {
        this.sunRoof = sunRoof;
    }
    
    public void carInfo() {
    	super.carInfo();
        System.out.println("Energy: " + this.getEnergy());
        System.out.println("sunRoof: " + this.getSunRoof());
    }
}
