package com.shohagh.java.Misc;

public class CustomClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomClass customClass = new CustomClass();
		Car car1 = customClass.new Car(50,100);
		Car car2 = customClass.new Car(50, 100);
		if(car1.equals(car2)){
			System.out.println("Two are equals");
		} else {
			System.out.println("Not equals");
		}
		System.out.println(car1.toString());
	}
	
	class Car{
		int speed;
		int fuel;
		Car(int speed, int fuel){
			this.speed=speed;
			this.fuel=fuel;
		}
		public boolean equals(Car car) {
	        return (this.speed == car.speed && this.fuel == car.fuel);
	    }
		public String toString() {
	        return (getClass().getName() + "@"+this.speed+","+this.fuel);
	    }
	}
}
