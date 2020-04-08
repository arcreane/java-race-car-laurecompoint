package Car;




import java.util.Scanner;

import Motor.Motor;




public class CarFast extends Car {
	Scanner scan = new Scanner(System.in);
	CarFast(){
		
	}
	
	CarFast(int id, String name, String color, int speed,  Motor motor, String wheels[],  String volant, String frein) {
		super(id, name, speed, color,  motor, wheels, volant, frein);
	
	}

	public static CarFast createcarfast() {
        CarFast carfast = new CarFast();
		
       
        carfast.FillCarInfo();
		return carfast;
		
	
	}
	
	public static Car speedpower() {
        CarFast speedpower = new CarFast();
		
     
        speedpower.SpeedCarFast();
		return speedpower;
		
	
	}

	

	
	

}
