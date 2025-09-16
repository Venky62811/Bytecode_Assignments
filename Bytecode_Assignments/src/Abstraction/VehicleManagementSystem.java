package Abstraction;
abstract class Vehicle {
	abstract String startEngine();
	abstract void stopEngine();
}
}
class Car extends Vehicle {
	public String startEngine(){
		return "car engine start";
		}
    public void stopEngine() {
    	System.out.println("car engine stop");
    }
}
class Truck extends Vehicle {
	public String startEngine() {
		return "truck engine start";
	}
	public void stopEngine() {
		System.out.println( "truck engine stop");
	}
}
class Bike extends Vehicle {
	public String startEngine() {
		return "bike engine start";
	}
	public void stopEngine() {
		System.out.println("bike engine stop");
	}
}
public class VehicleManagementSystem {

	public static void main(String[] args) {
	 
		Vehicle v1=new Car();
		System.out.println(v1.startEngine());
		v1.stopEngine();
        
		Vehicle v2=new Truck();
		System.out.println(v2.startEngine());
		v2.stopEngine();
		
		Vehicle v3=new Bike();
		System.out.println(v3.startEngine());
		v3.stopEngine();
	}

}
