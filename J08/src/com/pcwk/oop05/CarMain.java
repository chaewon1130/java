package com.pcwk.oop05;

public class CarMain {

	public static void main(String[] args) {
		Car car = new Car();
		System.out.println("Car() : "+car.color + ", " + car.gearType
				+ ", " + car.door);
		System.out.println(car.gearType);
		
		Car car02 = new Car("Aqua-Blue");
		System.out.println("Car(\"Aqua-Blue\") : "+car02.color + ", " + car02.gearType
				+ ", " + car02.door);
		
		System.out.println(car02.toString());
	}
}