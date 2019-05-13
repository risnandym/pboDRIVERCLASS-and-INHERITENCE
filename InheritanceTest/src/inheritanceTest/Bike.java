package inheritanceTest;

public class Bike extends Vehicle {
	private String bikeType;
	private String colorBike;
	
	public Bike(int numWheels, String bikeType) {
		super(numWheels);
		this.bikeType = bikeType;
	}
	
	public String getBikeType() {
		return bikeType;
	}
	
	public String getColorBike() {
		return colorBike;
	}

}
