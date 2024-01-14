package Classes;

public class ElectricCar extends GreenCars {
	
    public ElectricCar(String companyName, int kilometers, double energy,Boolean sunRoof) {
        super(companyName, kilometers, energy, sunRoof);
    }
    
    public void avgElect() {
    	double avgElect = this.kilometrage * this.energy;
    	System.out.println("The average elect is " + avgElect);
    }
}
