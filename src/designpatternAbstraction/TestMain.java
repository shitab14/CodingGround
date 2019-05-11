package designpatternAbstraction;

public class TestMain extends Car {

	public static void main(String[] args) {
		
		Car car=new Car();
		Plane plane=new Plane();
		
		System.out.println("The Car has "+car.set_num_of_wheels()+" wheels.");
		System.out.println("The Plane has "+plane.set_num_of_wheels()+" wheels.");
		System.out.println("The Car has "+car.set_num_of_passengers()+" passengers.");
		System.out.println("The Plane has "+plane.set_num_of_passengers()+" passengers.");
		System.out.println("The Car has gas: "+car.has_gas());
		System.out.println("The Plane has gas: "+plane.has_gas());

	}

}
