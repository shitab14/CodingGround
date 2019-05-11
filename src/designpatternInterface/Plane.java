package designpatternInterface;

public class Plane implements Vehicle {
	
	int wheels=3;
	int passengers=120;
	boolean gas=true;
	
	public int set_num_of_wheels() {
		return wheels;
	}
	
	public int set_num_of_passengers() {
		return passengers;
	}
	
	public boolean has_gas() {
		return gas;
	}

}
