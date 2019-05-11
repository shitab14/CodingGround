package designpatternInterface;

public class Car implements Vehicle {
	
	int wheels=4;
	int passengers=6;
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
