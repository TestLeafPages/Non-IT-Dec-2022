package week1.day1;

public class Car {
	
	public void driveCar() {
		System.out.println("Drive car carefully");
	}
	
	private void applyBrake() {
		 System.out.println("Stop the car");

	}
	
	 void soundHorn() {
		System.out.println("Hey please move");
	}
	
	public static void main(String[] args) {
		//Create an object
		//Classname objectName=new Classname();
		Car obj=new Car();
		obj.applyBrake();
		obj.driveCar();
		
		
		
		
	}

}
