package Classes;

public class SunCar extends GreenCars {
	
    public SunCar(String companyName, int kilometers, double energy,Boolean sunRoof) {
        super(companyName, kilometers, energy, sunRoof);
    }
    
    public void avgSun() {
    	double avgSun = this.energy * 2100.8;
    	System.out.println("The average sun is " + avgSun);
    }
}
