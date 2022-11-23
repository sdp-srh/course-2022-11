package automotive;

public class Truck extends Car implements LoadingArea {
	
	private int capacity;

	public int getCapacity() {

		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
		
	}


}
