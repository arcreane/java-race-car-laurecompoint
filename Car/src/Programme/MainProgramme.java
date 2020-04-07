package Programme;


//import org.fusesource.jansi.AnsiConsole;
//import static org.fusesource.jansi.Ansi.*;
//import static org.fusesource.jansi.Ansi.Color.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


import Car.CarFast;
import Car.CarSlow;
import Motor.Motor;
import Motor.MotorRapide;
import Motor.MotorSlow;
import Car.Car;
import Users.Personne;


public class MainProgramme {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		ArrayList<Personne> user = new ArrayList<>();
		ArrayList<Car> car = new ArrayList<>();
		ArrayList<Motor> motor = new ArrayList<>();
		
		
		 user.add(Personne.createuser());
		
		System.out.println("Choisie le type de voiture : type 1 pour voiture rapide et type 2 pour voiture lent");
		while( scan.hasNextInt() == false ) {
			System.out.println("Choisie un nombre entre 1 et 2");
			scan.next();
		}	
		 int answer = scan.nextInt();
		 switch(answer) {
		  case 1:
			  System.out.println("Vous avez choisie une voiture rapide");
			 
			 long timestartracefast = System.currentTimeMillis();
			 car.add(CarFast.createcarfast());
			 motor.add(MotorRapide.motorrapide());
			 System.out.println("Vous voiture commence a roulez avec une certain vitesse");
			 System.out.println("Attention, vous avez 60% de chance de perdre des pieces pendant la courses.");
			 car.add(CarFast.speedpower());
			 long timeendracefast = System.currentTimeMillis();
			 float timeracefast = (timeendracefast - timestartracefast) / 1000F;
			 System.out.println("Votre voiture à fini la course et à parcouru 50km en " + timeracefast  + " seconde");
			 System.out.println("Fin du jeu");
			 
		    break;
		  case 2:
			  System.out.println("Vous avez choisie une voiture lente");
			  long timestartraceslow = System.currentTimeMillis();
			  car.add(CarSlow.createcarslow());
			  motor.add(MotorSlow.motorslow());
			  System.out.println("Vous voiture commence a roulez avec une certain vitesse, choisisez la vitesse de votre voiture ?");
			  System.out.println("Attention, avec avez 30% de chance d'essayer d'avoir un boost de vitesse pour vous aider pendant la courses");
			  car.add(CarSlow.speedpower());
			  long timeendraceslow = System.currentTimeMillis();
			  float timeraceslow = (timeendraceslow - timestartraceslow) / 1000F;
			  System.out.println("Votre voiture à fini la course et à parcouru 50km en " + timeraceslow + " seconde");
			  System.out.println("Fin du jeu");
				 
			  
			 
			  
		    break;
		
		  default:
			   
			 
			}
		
	}

	
	
	

}
