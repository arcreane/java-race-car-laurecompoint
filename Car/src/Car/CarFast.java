package Car;

import static org.fusesource.jansi.Ansi.ansi;

import java.util.ArrayList;
import java.util.Scanner;

import Motor.Motor;
import Wheels.Wheels;



public class CarFast extends Car {
	Scanner scan = new Scanner(System.in);
	CarFast(){
		
	}
	
	CarFast(int id, String name, String color, int speed, String power, Motor moteur, String wheels[],  String volant, String frein) {
		super(id, name, color, speed, power,  moteur, wheels, volant, frein);
	
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
