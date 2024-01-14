package Main;
import Classes.*;

public class Main {

	public static void main(String[] args) {
		
		GasolineCar gc = new GasolineCar("Honda",80,1996);
		
		gc.carInfo();
		
		System.out.println();

		
		SunCar sc = new SunCar("Tesla",100,9.2,true);
		
		sc.carInfo();
		
		System.out.println();

		ElectricCar ec = new ElectricCar("Toyota",100,10.5,false);

		ec.carInfo();

		System.out.println();

		UltimateCar uc = new UltimateCar("Tesla",100,2019,9.2,true);
		
		uc.carInfo();


		
	}

}
