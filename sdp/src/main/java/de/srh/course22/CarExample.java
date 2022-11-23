package de.srh.course22;

public class CarExample {

	public static void main(String[] args) {
		System.out.println("Our program starts here");
		Car teslaCar = new Car();
		teslaCar.brand = "Tesla";
		teslaCar.doors = 4;
		System.out.println(teslaCar.brand);
		
		teslaCar.drive();
		
		teslaCar.printCarInformation();
		
		Car beetle = new Car();
		beetle.setBrand("VW");
		beetle.setDoors(2);
		beetle.printCarInformation();
		
		int speed1 = beetle.accelerate(10);
		System.out.println(speed1);
		int speed2 = beetle.accelerate(50);
		System.out.println(speed2);
		System.out.println(beetle.getSpeed());
		
		
		Car bmw = new Car();
		bmw.printCarInformation();

		Car fiat = new Car("Fiat", 2);
		fiat.printCarInformation();
		
		System.out.println("Total amount of cars "+ Car.amountOfCars);
	
		
		Cabrio porsche = new Cabrio("Porsche", 2);
		
		if (porsche.isRoof()) {
			System.out.println("Porsche with Roof");
		}
		else {
			System.out.println("Porsche without Roof is a Cabrio");
		}
	}
	
	

}
