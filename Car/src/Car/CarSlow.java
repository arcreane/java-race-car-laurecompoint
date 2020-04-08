package Car;

import Motor.Motor;


public class CarSlow extends Car {
	CarSlow(){
		
	}
	
	CarSlow(int id, String color, int speed, String name, Motor motor, String wheels[],  String volant, String frein) {
		super(id, color, speed, name, motor, wheels, volant, frein);
	
	}

	public static CarSlow createcarslow() {
		CarSlow carslow = new CarSlow();
		
       
        carslow.FillCarInfo();
		return carslow;
	}

	public static CarSlow speedpower() {
		 CarSlow speedpower = new CarSlow();
			
		
	        speedpower.SpeedCarSlow();
			return speedpower;
	}
	

}
