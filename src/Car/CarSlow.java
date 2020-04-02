package Car;

import Motor.Motor;
import Wheels.Wheels;

public class CarSlow extends Car {
	CarSlow(){
		
	}
	
	CarSlow(int id, String color, int speed, String power, String name, Motor moteur, Wheels[] arraywheels,  String volant, String frein) {
		super(id, power, color, speed, name, moteur, arraywheels, volant, frein);
	
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
