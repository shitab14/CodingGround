package designpatternAbstraction;

public class Car extends Vehicle{

	static int wheels=4;
	static int passengers=6;
	static boolean gas=true;
	
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
