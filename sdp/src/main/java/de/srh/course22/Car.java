package de.srh.course22;

public class Car {
	String brand;
	int doors;
	int speed = 0;
	public static int amountOfCars = 0;
	
	public Car() {
		brand = "?";
		doors = -1;
		speed = 0;
		Car.amountOfCars +=1;
	}
	
	public Car(String brand, int doors) {
		this();
		this.brand = brand;
		this.doors = doors;
	}
	
	
	
	public void drive() {
		System.out.println("I am driving");
	}
	
	public void printCarInformation() {
		System.out.println("It is a " +this.brand+" with "+this.doors+" doors");
	}
	
	public int accelerate(int difference) {
		this.speed = this.speed + difference;
		return this.speed;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
}
