package de.srh.course22;

public class Cabrio extends Car {
	
	boolean roof;

	public Cabrio() {
		super();
		roof = false;
	}

	public Cabrio(String brand, int doors) {
		super(brand, doors);
		roof = false;
	}

	public boolean isRoof() {
		return roof;
	}

	public void setRoof(boolean roof) {
		this.roof = roof;
	}
	
	

}
